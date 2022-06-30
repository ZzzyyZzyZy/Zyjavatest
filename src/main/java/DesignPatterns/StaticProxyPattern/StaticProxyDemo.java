package DesignPatterns.StaticProxyPattern;

/**
 * @author zy
 * @date 2022/6/17 16:50
 */
public class StaticProxyDemo {
  public static void main(String[] args) {

    //
      SubjectProxy subject = new SubjectProxy();
      subject.doAction();
      subject.byebye();
  }
}
