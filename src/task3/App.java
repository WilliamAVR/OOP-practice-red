package task3;

public class App {
    public static void main(String[] args) {
        Point pt1 = new Point(5,6);
        Line l1 = new Line(new Point(5,4),new Point(10,10));
        Line l2 = new Line(l1);
        System.out.println(l2);
    }
}
