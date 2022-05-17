
package com.sg.foundations.flowcontrol.shapesperimeters;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class ShapesAndPerimeters {
    protected String color;
    
    public void getArea() {
    
    }
    
    public void getPerimeter() {
    
    }
    
}

class Square extends ShapesAndPerimeters{
    
    public float getArea(float a, float b) {
        return a * b;
    }
    
    public float getPerimeter(float a, float b) {
        return a + b;
    }
}

class Rectangle extends ShapesAndPerimeters{
    
    public float getArea(float a, float b) {
        return a * b;
    }
    
    public float getPerimeter(float a, float b) {
        return a + b;
    }
}

class Triangle extends ShapesAndPerimeters{
    
    public float getArea(float base, float height) {
        return base * height / 2;
    }
    
    public float getPerimeter(float a, float b, float c) {
        return a + b + c;
    }
}

class circle extends ShapesAndPerimeters{
    protected final double PI = 3.14;
    
    public float getArea(double radius) {
        return (float)(PI * radius * radius);
    }
    
    public float getPerimeter(float a, float b) {
        return a + b;
    }
}