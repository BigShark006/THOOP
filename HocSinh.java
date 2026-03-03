package bai2_1;
import java.util.Scanner;

public class HocSinh {
    private String maSo;
    private String hoTen;
    private double diemTrungbinh;

    public HocSinh() {
        this.maSo = "";
        this.hoTen = "";
        this.diemTrungbinh = 0.0;
    }

    public HocSinh(String maSo, String hoTen, double diemTrungbinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemTrungbinh = diemTrungbinh;
    }

    public HocSinh(HocSinh other) {
        this.maSo = other.maSo;
        this.hoTen = other.hoTen;
        this.diemTrungbinh = other.diemTrungbinh;
    }

    public String getMaSo() {
        return maSo;
    }
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public double getDiemTrungbinh() {
        return diemTrungbinh;
    }
    public void setDiemTrungbinh(double diemTrungbinh) {
        this.diemTrungbinh = diemTrungbinh;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma so: ");
        this.maSo = sc.nextLine().trim();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine().trim();

        while(true) {
            System.out.print("Nhap diem trung binh: ");
            String s = sc.nextLine().trim();
            try {
                double d = Double.parseDouble(s);
                if (d < 0 || d > 10) {
                    System.out.println("Diem phai trong [0..10]. Vui long nhap lai.");
                    continue;
                }
                this.diemTrungbinh = d;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai dinh dang. Vui long nhap lai.");
            }
        }       
    }

    public void xuat() {
        System.out.printf("Ma so: %-10s | Ho ten: %-25s | DTB: %.2f\n", maSo, hoTen, diemTrungbinh);
    }
}