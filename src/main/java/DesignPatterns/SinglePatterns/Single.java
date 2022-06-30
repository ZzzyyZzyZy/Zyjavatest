package DesignPatterns.SinglePatterns;

/**
 * @author zy
 * @date 2022/5/15 23:34
 *饿汉式
 *
 */
public class Single {

    private static final Single INSTANCE = new Single();

    private Single(){};

    public static Single getInstance(){
        return INSTANCE;
    }

  public static void main(String[] args) {
    //
      Single s1 = Single.getInstance();
      Single s2 = Single.getInstance();

    System.out.println(s1 == s2);
  }
}
