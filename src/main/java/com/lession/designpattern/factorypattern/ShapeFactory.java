package com.lession.designpattern.factorypattern;

public class ShapeFactory {
    private Shape shape;



    public Shape getShape(ShapeEnum shapeEnum) {
        if (shapeEnum == ShapeEnum.SQUARE)
            shape = new Square();
        if (shapeEnum == ShapeEnum.CIRCLE)
            shape = new Circle();
        if (shapeEnum == ShapeEnum.RECTANGLE)
            shape = new Rectangle();
        return shape;
    }
}
