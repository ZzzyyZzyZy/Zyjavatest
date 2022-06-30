package DesignPatterns.StaticProxyPattern;

/**
 * @author zy
 * @date 2022/6/17 16:44
 */
public class RealSubject implements ISubject {
  @Override
  public void doAction() {
    System.out.println("real");
  }

  @Override
  public void byebye() {
    System.out.println("bye bye");
  }
}
