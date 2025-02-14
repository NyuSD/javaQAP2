package Line;
import Rectangle.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println(line1);
        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1 (radians): " + line1.getGradient());

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(5, 10);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("\n" + line2);
        System.out.println("Length of line2: " + line2.getLength());
        System.out.println("Gradient of line2 (radians): " + line2.getGradient());

        line1.setBeginXY(10, 20);
        line1.setEndXY(15, 25);
        System.out.println("\nAfter setting new begin and end for line1:");
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient (radians): " + line1.getGradient());
    }
}