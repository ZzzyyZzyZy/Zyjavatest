package Reflect.Class_;

import java.lang.reflect.Field;

/**
 * @author zy
 * @date 2022/6/23 23:06
 * 反射的方法
 */
public class Class02 {
  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException,
          NoSuchFieldException {
    //
    Class<?> cls = Class.forName("Reflect.Class_.Car");

    System.out.println(cls); // 显示cls对象  class Reflect.Class_.Car

    System.out.println(cls.getClass()); // 输出 cls运行类型  class java.lang.Class

    // 显示包名
    System.out.println(cls.getPackage().getName());

    // 显示完整类名
    System.out.println(cls.getClass().getName());

    // 通过cls创建对象实例
    Car car = (Car) cls.newInstance();
    System.out.println(car);

    // 通过反射获取属性
    Field brand = cls.getField("brand");
    System.out.println(brand.get(car));

    // 通过反射给属性赋值
    brand.set(car, "奔驰");
    System.out.println(brand.get(car));

    // 获取所有属性
    Field[] fields = cls.getFields();
    for (Field field : fields) {
      System.out.println(field.get(car));
    }
  }
}
