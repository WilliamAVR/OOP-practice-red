package task4;

public class PointUtils {
    public static void movePoints(Point[] points, int dx, int dy){
        for (int i = 0; i < points.length; i++) {
            points[i].movePoint(dx,dy);
        }
    }
    public static Point mergePoints(Point[] points){
        Point newPoint = new Point();
        for (int i = 0; i < points.length; i++) {
            newPoint.movePoint(points[i].getX(),points[i].getY());
        }
        return newPoint;
    }
}
