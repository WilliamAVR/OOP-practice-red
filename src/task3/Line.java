package task3;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(Line other) {
        this(other.p1,other.p2);
    }
    public double length(){
        double a = p1.getX()- p2.getX();
        a=Math.pow(a,2);
        double b = p1.getY()- p2.getY();
        b=Math.pow(b,2);
        return Math.sqrt(a+b);

    }

    @Override
    public String toString() {
        return String.format("%s : %s - length: %.2f", p1, p2, length());
    }
}
