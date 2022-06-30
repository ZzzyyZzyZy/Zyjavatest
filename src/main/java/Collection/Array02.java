package Collection;

import java.util.Scanner;

/**
 * @author zy
 * @date 2022/4/17 21:50
 */
public class Array02 {
  public static void main(String[] args) {
    //
    double[] scores = new double[5];
    //
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < scores.length; i++) {
      //
      System.out.println("请输入第" + (i + 1) + "个元素");
      scores[i] = scanner.nextDouble();
    }

    for (int i = 0; i < scores.length; i++) {
      //
      System.out.println(scores[i]);
    }
  }
}
