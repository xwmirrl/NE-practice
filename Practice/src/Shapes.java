public class Shapes {

    public static void main(String[] args) {

    Shape a = new Circle(4);
    Shape b = new Rectangle(7, 3);
    Shape c = new Triangle(6, 2);

    a.getArea();
    b.getArea();
    c.getArea();

    }
}

interface Shape {

    void getArea();

}

class Rectangle implements Shape {

    private final int length;
    private final int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void getArea() {

        System.out.println(length * width);

    }

}

class Circle implements Shape {

    private final int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void getArea() {

        System.out.println(radius * radius *  3.14);

    }

}

class Triangle implements Shape {

    private final int length2;
    private final int height;

    Triangle(int length, int height) {
        this.length2 = length;
        this.height = height;
    }

    public void getArea() {

        System.out.println((length2 * height) / 2);

    }

}
