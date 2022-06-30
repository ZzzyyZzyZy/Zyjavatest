package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zy
 * @date 2022/6/23 22:09
 */
public class Reflection01 {

  public static void main(String[] args)
      throws ClassNotFoundException, InvocationTargetException, InstantiationException,
          IllegalAccessException, NoSuchMethodException {

    m1();
    m2();
    m3();
  }

  public static void m1() {
    Cat cat = new Cat();
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000000; i++) {
      cat.hi();
      //
    }
    long end = System.currentTimeMillis();
    System.out.println("m1耗时" + (end - start));
  }

  public static void m2()
      throws ClassNotFoundException, InstantiationException, IllegalAccessException,
          NoSuchMethodException, InvocationTargetException {
    Class<?> rcat = Class.forName("Reflect.Cat");
    Object o = rcat.newInstance();
    Method hi = rcat.getMethod("hi");
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000000; i++) {
      hi.invoke(o);
      //
    }
    long end = System.currentTimeMillis();
    System.out.println("m2耗时" + (end - start));
  }

  // 反射检测 关闭访问检查
  public static void m3()
      throws ClassNotFoundException, InstantiationException, IllegalAccessException,
          NoSuchMethodException, InvocationTargetException {
    Class<?> rcat = Class.forName("Reflect.Cat");
    Object o = rcat.newInstance();
    Method hi = rcat.getMethod("hi");
    hi.setAccessible(true);
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000000; i++) {
      hi.invoke(o);
      //
    }
    long end = System.currentTimeMillis();
    System.out.println("m3耗时" + (end - start));
  }
}
