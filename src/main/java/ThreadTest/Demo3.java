package ThreadTest;

/**
 * @author zy
 * @date 2022/5/11 22:14 多个线程同时操作同一个对象 火车抢票
 */


class selltick01 extends Thread{
  private static int ticketNum = 1000;
  /**
   * If this thread was constructed using a separate
   * <code>Runnable</code> run object, then that
   * <code>Runnable</code> object's <code>run</code> method is called;
   * otherwise, this method does nothing and returns.
   * <p>
   * Subclasses of <code>Thread</code> should override this method.
   *
   * @see #start()
   * @see #stop()
   * @see #Thread(ThreadGroup, Runnable, String)
   */
  @Override
  public void run() {
    while (true){
      if (ticketNum <=0){
        System.out.println("售票结束");
        break;
      }
      else{
        System.out.println("窗口 " + Thread.currentThread().getName() + "剩余票数" + (--ticketNum) );
      }
    }
  }
}

public class Demo3 implements Runnable {

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

  // 定义票数
  //
  private int ticktnum = 300;

  @Override
  public void run() {
    while (true) {
      if (ticktnum <= 0) {
        break;
      }
      System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticktnum-- + "票");
    }
  }

  public static void main(String[] args) {
//    Demo3 demo3 = new Demo3();
//    new Thread(demo3, "1").start();
//    new Thread(demo3, "2").start();
//    new Thread(demo3, "4").start();
//    new Thread(demo3, "5").start();
//    new Thread(demo3, "3").start();
//    new Thread(demo3, "6").start();
//    new Thread(demo3, "7").start();
//    new Thread(demo3, "8").start();
//    new Thread(demo3, "9").start();
//    new Thread(demo3, "30").start();
//    new Thread(demo3, "39").start();
//    new Thread(demo3, "38").start();
//    new Thread(demo3, "36").start();

    selltick01 selltick01 = new selltick01();
    selltick01 selltick02 = new selltick01();
    selltick01 selltick03 = new selltick01();
    selltick01 selltick04 = new selltick01();
    selltick01 selltick05 = new selltick01();

    selltick02.start();
    selltick01.start();
    selltick04.start();
    selltick05.start();
    selltick03.start();
    selltick03.start();
  }
}

