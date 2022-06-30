package reflection;

/**
 * @author zy
 * @date 2022/6/20 23:16
 */
public class Test01 {
  public static void main(String[] args) {
    //
      Person person = new Student();
    System.out.println(person.name);
  }


}


class Person{
    protected String name;
}

class Student extends Person{
    public Student() {
    this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}