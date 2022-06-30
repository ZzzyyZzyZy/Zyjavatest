package DesignPatterns.Factory;

/**
 * @author zy
 * @date 2022/6/16 23:58
 */
public class CarFactory {
    public static Car getCar(String car){
        if(car.equals("Benchi")){
            return new Benchi();
        }else if (car.equals("WuLing")){
            return new WuLing();
        }else {
            return null;
        }
    }
}
