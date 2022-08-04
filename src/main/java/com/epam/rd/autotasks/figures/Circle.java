package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private final Point centerPoint;
    private final double radius;

    public Circle(Point centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public double area() {
return Math.PI * Math.pow(radius, 2.0);
    }

    public String pointsToString() {
    return centerPoint.toString();
    }

    public String toString() {
        return  this.getClass().getSimpleName() + "[" + pointsToString() + radius + "]";
    }

    public Point leftmostPoint() {
        return new Point(centerPoint.getX() - radius, centerPoint.getY());
    }
}
