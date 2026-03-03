package bai2_3;

public class Coordinate {
    private double x;
    private double y;

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public Coordinate tong(Coordinate p) {
        return new Coordinate(this.x + p.x, this.y + p.y);
    }

    public Coordinate doiXungTrucHoanh() {
        return new Coordinate(this.x, -this.y);
    }

    public void inToaDo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}