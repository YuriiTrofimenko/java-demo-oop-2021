package org.tyaa.demo.java.se.opp;

import org.tyaa.demo.java.se.opp.models.AbstractShape;
import org.tyaa.demo.java.se.opp.models.Line;
import org.tyaa.demo.java.se.opp.models.Point;
import org.tyaa.demo.java.se.opp.models.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	    // POJO - Plain Old Java Object
        Point p1 = new Point(10, 20);
        Line l1 = new Line(new Point(30, 30), new Point(50, 75));
        Rectangle r1 = new Rectangle(new Point(100, 100), 50, 250);
        /* p1.show();
        l1.show();
        r1.show(); */
        System.out.printf("Line Length: %s\n", l1.getLength());
        System.out.printf("Rectangle Length: %s\n", r1.getLength());

        ArrayList<AbstractShape> shapes = new ArrayList<>();
        shapes.add(l1);
        shapes.add(r1);
        for (AbstractShape shape : shapes) {
            // System.out.printf("Shape Length: %s\n", shape.getLength());
        }
    }
}
