package bai2_1;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DanhSachHocSinh dshs = new DanhSachHocSinh();

        System.out.println("=== NHAP DANH SACH ===");
        dshs.nhapDanhSach(sc);

        System.out.println("\n=== DANH SACH VUA NHAP ===");
        dshs.inDanhSach();

        dshs.sapXepGiamDanTheoDTB();
        System.out.println("\n=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO DTB ===");
        dshs.inDanhSach();

        System.out.println("\n=== HOC SINH CO DTB CAO NHAT TRONG DANH SACH ===");
        HocSinh max = dshs.timHocSinhDTBCaoNhat();
        if (max != null) max.xuat();
        else System.out.println("(Danh sach rong)");

        sc.close();
    }
}