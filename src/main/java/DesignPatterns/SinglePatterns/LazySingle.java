package DesignPatterns.SinglePatterns;

/**
 * @author zy
 * @date 2022/5/16 23:56
 */
public class LazySingle {

  private static LazySingle INSTANCE;

  private LazySingle() {}

  public static LazySingle getInstance() {
    if (INSTANCE == null) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      INSTANCE = new LazySingle();
    }
    return INSTANCE;
  }

  public void m() {
    System.out.println("m");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> System.out.println(LazySingle.getInstance().hashCode())).start();
    }
  }
}
