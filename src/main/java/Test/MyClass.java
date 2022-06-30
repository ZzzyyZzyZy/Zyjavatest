package Test;

/**
 * @author zy
 * @date 2022/6/16 23:32
 */
enum Color
{
    RED,BLUE,BLACK
}
public class MyClass {
  public static void main(String[] args) {
    //
      for (Color color :Color.values()) {
      System.out.println(color);
      }

  }
}
