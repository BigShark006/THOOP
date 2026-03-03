package bai2_2;
import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        if(mau == 0) {
            this.tu = 0;
            this.mau = 1;
        } else {
            this.tu = tu;
            this.mau = mau;
            chuanHoa();
            rutGon();
        }
    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo(Scanner sc) {
        while (true) {
            try {
            System.out.print("Nhap tu so: ");
            this.tu = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Nhap mau so: ");
            this.mau = Integer.parseInt(sc.nextLine().trim());

            if(this.mau == 0) {
                System.out.println("Mau so phai khac 0. Nhap lai!");
                continue;
            }
            break;
            } catch (NumberFormatException e) {
            System.out.println("Sai dinh dang!. Vui long nhap so nguyen");
            }
        }
    }

    public void xuatPhanSo() {
        if(mau == 1) {
            System.out.println(tu);
        } else if (tu == 0) {
            System.out.println(0);
        } else {
            System.out.println(tu + "/" + mau);
        }
    }

    private int USCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 && b==0) return 1;
        if(b==0) return a == 0 ? 1 : a;
        while (b != 0) {
            int r = b;
            b = a % b;
            a = r;
        } 
        return a == 0 ? 1 : a;
    } 

    private void rutGon() {
        int u = USCLN(tu, mau);
        tu /= u;
        mau /= u;
    }

    private void chuanHoa() {
        if(mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    public PhanSo cong(PhanSo p ) {
        int t = this.tu * p.mau + p.tu * this.mau;
        int m = this.mau * p.mau;
        return new PhanSo(t, m);
    }

    public PhanSo tru(PhanSo p ) {
        int t = this.tu * p.mau - p.tu * this.mau;
        int m = this.mau * p.mau;
        return new PhanSo(t, m);
    }

    public PhanSo nhan(PhanSo p ) {
        int t = this.tu * p.tu;
        int m = this.mau * p.mau;
        return new PhanSo(t, m);
    }

    public PhanSo chia(PhanSo p ) {
        if(p.tu == 0) {
            return new PhanSo(0, 1);
        }
        int t = this.tu * p.mau;
        int m = this.mau * p.tu;
        return new PhanSo(t, m);
    }


}