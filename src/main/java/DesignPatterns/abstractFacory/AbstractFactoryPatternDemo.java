package DesignPatterns.abstractFacory;

/**
 * @author zy
 * @date 2022/6/17 01:07
 */
public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {
    //获取形状工厂
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
      //从形状工厂中获取circle
      Shape circle = shapeFactory.getShape("CIRCLE");

      circle.draw();

      //获取颜色工厂
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

      //获取红色
      Color black = colorFactory.getColor("BLACK");

      //调用方法
      black.fill();
  }
}
