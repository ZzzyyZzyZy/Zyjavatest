package method;

import java.util.Date;

/**
 * @author zy
 * @date 2022/4/27 00:26
 */
public class Demo01 {
  public static void main(String[] args) {
    int c = add(1, 2);
    System.out.println(c);

      // 初始化 Date 对象
      Date date = new Date();

      // 使用 toString() 函数显示日期时间
      System.out.println(date.toString());
    //
  }

  public static int add(int a, int b) {
    return a + b;
  }
}
