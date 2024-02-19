package hr.fer.oop.auditorne.audit3;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(1,1);
        double distance = p1.distanceToPoint(p2);
        System.out.println(distance);

        Point p3 = new Point(5, 7);

        Point p = PointOperations.getPointMostDistantFromOrigin(p1, p2, p3, new Point(3, 6), new Point(1,2));
        System.out.println(p.toString());
}
}

