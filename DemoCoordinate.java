package bai2_3;

public class DemoCoordinate {
    public static void main(String[] args) {
        Coordinate a = new Coordinate();
        System.out.print("Diem a = ");
        a.inToaDo();

        Coordinate b = new Coordinate(3, -5);
        System.out.print("Diem b = ");
        b.inToaDo();

        Coordinate c = a.tong(b);
        System.out.print("Tong a + b = ");
        c.inToaDo();

        Coordinate d = b.doiXungTrucHoanh();
        System.out.print("Doi xung truc hoanh cua b = ");
        d.inToaDo();
    }
}