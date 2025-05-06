package oop.exercise.Inheritance_Practice;
//6.
//Create a class named 'Shape' with a method to print "This is This is shape". Then create two other
//classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is
//rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle'
//having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by
//the object of 'Square' class
public class Question6 {
    public static void main(String[] args) {
        Square6 sq = new Square6();

        // call all three methods individually
        sq.squareMessage();
        sq.rectangleMessage();
        sq.shapeMessage();
    }
}

class Shape {
    public void shapeMessage() {
        System.out.println("This is shape");
    }
}

class Rectangle6 extends Shape {
    public void rectangleMessage() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void circleMessage() {
        System.out.println("This is circular shape");
    }
}

class Square6 extends Rectangle6 {
    public void squareMessage() {
        System.out.println("Square is a rectangle");
    }
}
