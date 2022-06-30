package ThreadTest;

/**
 * @author zy
 * @date 2022/5/18 22:42
 * 一个简单的静态代理的例子
 */
public class Demo04 {
    public static void main(String[] args) {
        //


        Tiger tiger = new Tiger();
        threadProxy threadProxy = new threadProxy(tiger);
        threadProxy.start();;
    }
}
class Animal {}

class Tiger extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫..");
    }
}

class threadProxy implements Runnable {
    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) target.run();
    }

    public threadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();
    }

    private void start0() {
        run();
    }
}
