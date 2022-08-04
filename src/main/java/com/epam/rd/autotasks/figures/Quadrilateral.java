package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;


    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area() {
        return new Triangle(a,b,d).area() + new Triangle(b,c,d).area();
    }

    public String pointsToString() {
    return a.toString()+b.toString()+c.toString()+d.toString();
    }
    public String toString() {
    return super.toString();
    }

    public Point leftmostPoint() {
        double temp = Math.min(a.getX(), b.getX());
        double temp2 = Math.min(c.getX(), d.getX());
        double minimal = Math.min(temp, temp2);
        if (a.getX() == minimal) return a;
        else if (b.getX() == minimal) return b;
        else if (c.getX() == minimal) return c;
        else return d;
    }
}
