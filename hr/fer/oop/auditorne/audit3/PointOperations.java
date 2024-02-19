package hr.fer.oop.auditorne.audit3;

public class PointOperations {
    public static Point getPointMostDistantFromOrigin(Point... args) {
        double max_distance = 0;
        Point longestdistancepoint = null;
        Point origin = new Point(0,0);
        for(int i = 1; i < args.length; i++)
        {
            Point p = new Point(args[i].getX(), args[i].getY());
            if(origin.distanceToPoint(p) > max_distance)
            {
                longestdistancepoint = p;
                max_distance = origin.distanceToPoint(p);
            }
        }

        return longestdistancepoint;

    }
}
