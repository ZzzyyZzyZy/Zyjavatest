package Reflect.Class_;

/**
 * @author zy
 * @date 2022/6/26 16:40
 */
public class GetClass_ {
  public static void main(String[] args) {
    //

  }
  static class A {
      //属性-成员变量-字段
      //类加载的链接-准备阶段
      //a是一个实例属性,不是静态变量  不会分配内存
      //b是一个静态变量 分配内存 默认初始化为0
      //c是一个static final是常量, 会赋为 c=50
      public int a = 20;
      public static int b = 30;
      public static final int c = 50;
  }
}
