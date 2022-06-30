package Reflect.Class_;

import Reflect.Cat;

/**
 * @author zy
 * @date 2022/6/23 22:40
 */
public class Class01 {
  public static void main(String[] args) throws ClassNotFoundException {
    //
    // 1.class也是类 因此继承object

    // 2.class类对象不是new出来的,而是系统创建的
    // (1)  public Class<?> loadClass(String name) throws ClassNotFoundException {
    //        return loadClass(name, false);
    //    }
    Cat cat = new Cat();

    //
    Class<?> cls = Class.forName("Reflect.Cat");

    // 3.对于某个类的Class类对象,在内存中只有一份,因为类只加载一次
    Class<?> cls1 = Class.forName("Reflect.Cat");

    System.out.println(cls.hashCode());
    System.out.println(cls1.hashCode());

    // 4.每个类的实例都会记得自己是由哪个Class实例所生成

    // 5.通过Class可以完整地得到一个类的完整结构,通过一系列API

    // 6.Class对象是存放在堆的

    // 7.类的字节码二进制数据,是放在方法区的,有的地方称为类的元数据
  }
}
