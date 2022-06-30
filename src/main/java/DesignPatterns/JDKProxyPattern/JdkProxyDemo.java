package DesignPatterns.JDKProxyPattern;

import DesignPatterns.StaticProxyPattern.SubjectProxy;

import java.lang.reflect.Proxy;

/**
 * @author zy
 * @date 2022/6/17 17:12
 */
public class JdkProxyDemo {
  public static void main(String[] args) {
    //

    SubjectJdkProxyHandler proxyHandler = new SubjectJdkProxyHandler(new RealSubject());

    ISubject subject =
        (ISubject)
                proxyHandler.getProxy();

    subject.doAction();

    ISubject subject2 =
            (ISubject)
                    Proxy.newProxyInstance(
                            Thread.currentThread().getContextClassLoader(),
                            new Class<?>[] {ISubject.class},
                            new SubjectJdkProxyHandler(new RealSubject2()));

    subject2.doAction();

  }
}
