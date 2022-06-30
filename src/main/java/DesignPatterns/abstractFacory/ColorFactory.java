package DesignPatterns.abstractFacory;

/**
 * @author zy
 * @date 2022/6/17 01:05
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("YELLOW")){
            return new Yellow();
        } else if(color.equalsIgnoreCase("BLACK")){
            return new Black();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
