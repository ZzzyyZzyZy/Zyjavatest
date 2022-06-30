package ThreadTest;

/**
 * @author zy
 * @date 2022/5/11 21:38
 */
public class Demo1 extends Thread{
  /**
   * If this thread was constructed using a separate <code>Runnable</code> run object, then that
   * <code>Runnable</code> object's <code>run</code> method is called; otherwise, this method does
   * nothing and returns.
   *
   * <p>Subclasses of <code>Thread</code> should override this method.
   *
   * @see #start()
   * @see #stop()
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
    Demo1 testthread1 = new Demo1();
    testthread1.start();

    for (int i = 0; i < 2000; i++) {
      //
      System.out.println("main" + i);
    }
  }
}
