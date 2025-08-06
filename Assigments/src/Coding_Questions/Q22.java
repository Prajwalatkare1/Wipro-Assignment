package Coding_Questions;

interface Drawable {
    void drawingColor();
    void thickness();
}

interface Fillable {
    void fillingColor();
    void size();
}

class Line implements Drawable {
    public void drawingColor() {
        System.out.println("Line drawing color: Black");
    }

    public void thickness() {
        System.out.println("Line thickness: 1px");
    }
}

class Circle implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Circle drawing color: Blue");
    }

    public void thickness() {
        System.out.println("Circle thickness: 2px");
    }

    public void fillingColor() {
        System.out.println("Circle filling color: Light Blue");
    }

    public void size() {
        System.out.println("Circle size: Radius 10 units");
    }
}

class Square implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Square drawing color: Red");
    }

    public void thickness() {
        System.out.println("Square thickness: 3px");
    }

    public void fillingColor() {
        System.out.println("Square filling color: Pink");
    }

    public void size() {
        System.out.println("Square size: 20x20 units");
    }
}

public class Q22 {
    public static void main(String[] args) {
        Line line = new Line();
        Circle circle = new Circle();
        Square square = new Square();

        System.out.println("Line:");
        line.drawingColor();
        line.thickness();

        System.out.println("\nCircle:");
        circle.drawingColor();
        circle.thickness();
        circle.fillingColor();
        circle.size();

        System.out.println("\nSquare:");
        square.drawingColor();
        square.thickness();
        square.fillingColor();
        square.size();
    }
}
