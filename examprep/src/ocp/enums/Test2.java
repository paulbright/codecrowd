/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.enums;

/**
 *
 * @author paulbright
 */
enum ShapeType {
    CIRCLE, SQUARE, RECTANGLE;
}
 
abstract class Shape {
    private ShapeType type = ShapeType.SQUARE; //default ShapeType
    
    Shape() {
        
    }
    Shape(ShapeType type) {
        this.type = type;
    }
 
    public ShapeType getType() {
        return type;
    }
 
    abstract void draw();
}

class NewShape extends Shape{

    public NewShape(){
        this(ShapeType.SQUARE);
    }
    public NewShape(ShapeType type) {
        super(type);
    }

    @Override
    void draw() {
    }
    
}
public class Test2 {
    public static void main(String[] args) {
        /*
        Shape shape = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a " + getType());
            }
        };
        shape.draw();
        */
        q1();
    }

    private static void q1() {
        Shape shape = new NewShape() {
            @Override
            void draw() {
                System.out.println("Drawing a " + getType());
            }
        };
        
        Shape shape2 = new NewShape(ShapeType.RECTANGLE) {
            @Override
            void draw() {
                System.out.println("Drawing a " + getType());
            }
        };
        shape.draw();
        shape2.draw();
    }
}