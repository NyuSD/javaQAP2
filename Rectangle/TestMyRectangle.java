package Rectangle;
public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(1, 1, 5, 4);
        System.out.println(r1);
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        MyPoint p1 = new MyPoint(2, 2);
        MyPoint p2 = new MyPoint(6, 5);
        MyRectangle r2 = new MyRectangle(p1, p2);
        System.out.println("\n" + r2);
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        r1.setTopLeft(new MyPoint(0, 0));
        r1.setBottomRight(new MyPoint(3, 3));
        System.out.println("\nAfter modifying r1:");
        System.out.println(r1);
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
    }
}
