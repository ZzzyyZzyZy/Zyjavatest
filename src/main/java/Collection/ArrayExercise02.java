package Collection;

/**
 * @author zy
 * @date 2022/4/17 22:32
 */
public class ArrayExercise02 {
  public static void main(String[] args) {
    //
    int[] a = {1, 3, 455, 42};
    int maxs = a[0];
    int maxindex = 0;
    for (int i = 0; i < a.length; i++) {
      //
      if (maxs < a[i]) {
        maxs = a[i];
        maxindex = i;
      }
    }
    System.out.println(maxs);
  }
}
