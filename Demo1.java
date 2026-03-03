package bai2_1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HocSinh hs1 = new HocSinh();
        HocSinh hs2 = new HocSinh("HS02", "Tran Van B", 8.5);
        HocSinh hs3 = new HocSinh(hs2); 

        System.out.println("=== Nhap thong tin cho hs1 (constructor khong tham so) ===");
        hs1.nhap(sc);

        System.out.println("\n=== Xuat thong tin 3 hoc sinh ===");
        hs1.xuat();
        hs2.xuat();
        hs3.xuat();

        System.out.print("\nNhap ten moi cho hs1: ");
        String tenMoi = sc.nextLine().trim();
        hs1.setHoTen(tenMoi);

        System.out.println("\n=== Sau khi doi ten hs1 ===");
        hs1.xuat();

        HocSinh max = hs1;
        if (hs2.getDiemTrungbinh() > max.getDiemTrungbinh()) max = hs2;
        if (hs3.getDiemTrungbinh() > max.getDiemTrungbinh()) max = hs3;

        System.out.println("\n=== Hoc sinh co DTB lon nhat (trong 3 hs) ===");
        max.xuat();

        sc.close();
    }
}