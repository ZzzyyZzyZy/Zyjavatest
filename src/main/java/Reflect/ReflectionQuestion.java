package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zy
 * @date 2022/6/22 23:35
 */
public class ReflectionQuestion {
  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException,
          NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
    // 反射机制
    // 1.加载类,返回class类型的对象cls
    String classfullpath = "Reflect.Cat";
    String methodName = "hi";
    Class<?> cls = Class.forName(classfullpath);
    // 2.通过cls 得到加载类的对象实例
    Cat o = (Cat) cls.newInstance();
    System.out.println("o的运行类型=" + o.getClass());
    // 3.通过cls得到你加载的类 的 方法对象
    // 在反射中,可以吧方法视为对象
    Method method = cls.getMethod(methodName);
    // 4.通过method调用方法,通过方法来实现调用方法
    method.invoke(o);

    // java.lang.reflect.field 代表类的成员变量.field对象表示某个类的成员变量
    // getField不能得到私有的属性
    //    Field age = cls.getField("age");
    //    System.out.println(age.get(o)); //传统写法 对象.成员变量 , 反射 : 成员变量对象.get(对象)

    // java.lang.reflect.constructor:代表类的构造方法,Constructor对象表示构造器
    Constructor<?> constructor = cls.getConstructor(); // ()中可以指定构造器参数类型,返回无参构造器
    System.out.println(constructor);
    System.out.println(cls.getConstructor(String.class));

   }
}
