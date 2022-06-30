package Basics_;

/**
 * @author zy
 * @date 2022/6/28 17:47
 * 初始化顺序
 * 首先先来看一下有哪些需要探讨的初始化顺序
 * 静态属性：static 开头定义的属性
 * 静态方法块： static {} 包起来的代码块
 * 普通属性： 非 static 定义的属性
 * 普通方法块： {} 包起来的代码块
 * 构造函数： 类名相同的方法
 */
public class LifeCycle {
    // 静态属性
    private static String staticField = getStaticField();
    // 静态方法块
    static {
        System.out.println(staticField);
        System.out.println("静态方法块初始化");
    }
    // 普通属性
    private String field = getField();
    // 普通方法块
    {
        System.out.println(field);
    }
    // 构造函数
    public LifeCycle() {
        System.out.println("构造函数初始化");
    }

    public static String getStaticField() {
        String statiFiled = "Static Field Initial";
        return statiFiled;
    }

    public static String getField() {
        String filed = "Field Initial";
        return filed;
    }
    // 主函数
    public static void main(String[] argc) {
        new LifeCycle();
    }
}
