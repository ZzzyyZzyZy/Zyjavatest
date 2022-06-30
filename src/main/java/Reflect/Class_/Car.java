package Reflect.Class_;

/**
 * @author zy
 * @date 2022/6/23 23:05
 */
public class Car {
    public String brand = "宝马";
    public int price = 1;
    public String color = "黑白";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
