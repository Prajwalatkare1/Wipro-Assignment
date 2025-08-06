package Coding_Questions;

class Shape {

  
    public int area(int side) {
        return side * side;
    }

   
    public int area(int length, int breadth) {
        return length * breadth;
    }

    public int perimeter(int side) {
        return 4 * side;
    }

   
    public int perimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }
}

public class Fourteen {

    public static void main(String[] args) {
        Shape shape = new Shape();

     
        int squareSide = 5;
        System.out.println("Square Area: " + shape.area(squareSide));
        System.out.println("Square Perimeter: " + shape.perimeter(squareSide));

     
        int length = 10;
        int breadth = 6;
        System.out.println("Rectangle Area: " + shape.area(length, breadth));
        System.out.println("Rectangle Perimeter: " + shape.perimeter(length, breadth));
    }
}
