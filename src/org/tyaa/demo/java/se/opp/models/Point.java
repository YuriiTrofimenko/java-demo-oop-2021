package org.tyaa.demo.java.se.opp.models;

public class Point extends AbstractShape {
    public Integer x;
    public Integer y;
    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void show() {
        System.out.printf("Point: (%s, %s)\n", x, y);
    }
}
