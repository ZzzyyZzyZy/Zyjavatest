package DesignPatterns.JDKProxyPattern;

/**
 * @author zy
 * @date 2022/6/17 17:05
 */
public class RealSubject2 implements ISubject {
  @Override
  public void doAction() {
    System.out.println("Real2 Action Here!");
  }
}
