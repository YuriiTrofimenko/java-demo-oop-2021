package org.tyaa.demo.java.se.opp.models;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rectangle extends AbstractShape implements ILengthable {
    public Point startPoint;
    public Integer width;
    public Integer height;
    public Rectangle(Point startPoint, Integer width, Integer height) {
        this.startPoint = startPoint;
        this.width = width;
        this.height = height;
    }
    @Override
    public void show() {
        System.out.println("*** Rectangle: ***");
        System.out.println("Start:");
        startPoint.show();
        System.out.printf("Width: %s, Height: %s\n", width, height);
        System.out.println("******");
    }
    @Override
    public Double getLength() {
        Line l1 = new Line(startPoint, new Point(startPoint.x + width, startPoint.y));
        Line l2 = new Line(startPoint, new Point(startPoint.x, startPoint.y + height));
        return l1.getLength() * 2 + l2.getLength() * 2;
    }
}
