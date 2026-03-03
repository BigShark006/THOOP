package bai2_2;

import java.util.Scanner;

public class DemoPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo p1 = new PhanSo();
        System.out.print("p1 (mac dinh) = ");
        p1.xuatPhanSo();

        System.out.println("\nNhap p1:");
        p1.nhapPhanSo(sc);
        System.out.print("p1 (sau khi nhap) = ");
        p1.xuatPhanSo();

        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("\np2 = ");
        p2.xuatPhanSo();

        System.out.println("\nNhap tu va mau de tao p3:");
        System.out.print("Nhap tu: ");
        int tu3 = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nhap mau (khac 0): ");
        int mau3 = Integer.parseInt(sc.nextLine().trim());
        PhanSo p3 = new PhanSo(tu3, mau3);

        System.out.print("p3 = ");
        p3.xuatPhanSo();

        PhanSo kqCong = p1.cong(p3);
        System.out.print("\nKet qua p1 + p3 = ");
        kqCong.xuatPhanSo();

        PhanSo p4 = new PhanSo(kqCong);
        System.out.print("p4 (copy tu kq) = ");
        p4.xuatPhanSo();

        PhanSo kqNhan = p4.nhan(p2);
        System.out.print("\nKet qua p4 * p2 = ");
        kqNhan.xuatPhanSo();

        sc.close();
    }
}