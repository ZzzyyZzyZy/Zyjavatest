package DesignPatterns.StaticProxyPattern;

/**
 * @author zy
 * @date 2022/6/17 16:46
 */
public class SubjectProxy implements ISubject{
    private ISubject subject;

    public SubjectProxy() {
        this.subject = new RealSubject();
    }

    @Override
    public void doAction() {
    System.out.println("dowater start");

    subject.doAction();

    System.out.println("dowater end");
    }

    @Override
    public void byebye() {
        System.out.println("Say goodbye");
    }
}
//建造
//策略