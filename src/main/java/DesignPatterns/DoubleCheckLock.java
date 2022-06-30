package DesignPatterns;

/**
 * @author zy
 * @date 2022/5/17 00:13
 * DoubleCheckLock
 *
 */
public class DoubleCheckLock {

  private static volatile DoubleCheckLock INSTANCE;  //volatile保证cpu指令有序,内存屏障,并非cpu级别 jvm层级规范要求

  private DoubleCheckLock() {}

  public static DoubleCheckLock getInstance() {
    if (INSTANCE == null) { //第一重检查 性能,效率 过滤掉大部分线程,无需要竞争上锁
      synchronized (DoubleCheckLock.class) {
        if (INSTANCE == null) {
          try {
            Thread.sleep(1);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          INSTANCE = new DoubleCheckLock();
        }
      }
    }
    return INSTANCE;
  }

  public void m() {
    System.out.println("m");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(DoubleCheckLock.getInstance().hashCode())).start();
    }
  }
}
