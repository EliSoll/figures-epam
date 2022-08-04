package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {
        //length 1
    double xDistanceSquare = Math.pow(a.getX() - b.getX(), 2.0);
    double yDistanceSquare = Math.pow(a.getY() - b.getY(), 2.0);
        double length1 = Math.sqrt(xDistanceSquare + yDistanceSquare);

        //length 2
    double xDistanceSquare2 = Math.pow(a.getX() - c.getX(), 2.0);
    double yDistanceSquare2 = Math.pow(a.getY() - c.getY(), 2.0);
    double length2 = Math.sqrt(xDistanceSquare2 + yDistanceSquare2);

        //length 3
    double xDistanceSquare3 = Math.pow(c.getX() - b.getX(), 2.0);
    double yDistanceSquare3 = Math.pow(c.getY() - b.getY(), 2.0);
    double length3 = Math.sqrt(xDistanceSquare3 + yDistanceSquare3);

        // semi-perimeter
    double s = (length1 +length2+length3)/2;

        return Math.sqrt(s*(s- length1)*(s-length2)*(s-length3));
}

    public String pointsToString() {
   return a.toString()+b.toString()+c.toString();
    }

    public String toString() {
    return super.toString();
    }

    public Point leftmostPoint() {
        double temp = Math.min(a.getX(), b.getX());
        double minimal = Math.min(temp, c.getX());
        if (a.getX() == minimal) return a;
        else if (b.getX() == minimal) return b;
        else return c;
    }

}
