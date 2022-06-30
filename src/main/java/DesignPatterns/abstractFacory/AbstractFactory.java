package DesignPatterns.abstractFacory;

/**
 * @author zy
 * @date 2022/6/17 01:01
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}

