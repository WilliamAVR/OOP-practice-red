package task4;

public class App {
    public static void main(String[] args) {
        task4.Point[] pointArr = new task4.Point[1];
        task4.Point p1 = new task4.Point(5,5);
        pointArr[0] = new task4.Point(5,5);
        PointUtils.movePoints(pointArr,1,3);
        System.out.println(pointArr[0]);
        Point[] points = new Point[3];
        points[0] = new Point(1,10);
        points[1] = new Point(9,9);
        points[2] = new Point(10,1);
        p1 = PointUtils.mergePoints(points);
        System.out.println(p1);
    }
}
