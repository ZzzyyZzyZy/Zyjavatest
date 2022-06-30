package ThreadTest;

/**
 * @author zy
 * @date 2022/5/11 21:56
 * 线程开启不一定立即执行,主要看cpu的调用时间
 */
public class Demo2 implements Runnable {

  /**
   * When an object implementing interface <code>Runnable</code> is used to create a thread,
   * starting the thread causes the object's <code>run</code> method to be called in that separately
   * executing thread.
   *
   * <p>The general contract of the method <code>run</code> is that it may take any action
   * whatsoever.
   *
   * @see Thread#run()
   */
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      //
      System.out.println("run" + i);
    }
  }

  public static void main(String[] args) {
    //
    Demo2 demo2 = new Demo2();
    new Thread(demo2).start();

    for (int i = 0; i < 20; i++) {
      //

      System.out.println("main" + i);
    }
  }
}
