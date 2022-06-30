package Reflect;

/**
 * @author zy
 * @date 2022/6/22 23:32
 */
public class Cat {
  private String name = "旺崽";
  public int age = 1;

  public Cat() {
  }

  public Cat(String name) {
    this.name = name;
  }

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void hi() {
//    System.out.println("hi " + name);
  }
}
