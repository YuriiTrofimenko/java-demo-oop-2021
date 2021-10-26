package org.tyaa.demo.java.se.opp.models;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Line extends AbstractShape implements ILengthable {
    // public Point startPoint = new Point(0, 0); // Composition
    public Point startPoint;
    public Point endPoint;
    // Aggregation
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    @Override
    public void show() {
        System.out.println("*** Line: ***");
        System.out.println("Start:");
        startPoint.show();
        System.out.println("End:");
        endPoint.show();
        System.out.println("******");
    }
    @Override
    public Double getLength() {
        return sqrt(pow(endPoint.x - startPoint.x, 2) + pow(endPoint.y - startPoint.y, 2));
    }
}
