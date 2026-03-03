package bai2_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachHocSinh {
    private final ArrayList<HocSinh> ds = new ArrayList<>();

    public void nhapDanhSach(Scanner sc) {
        int n;
        while (true) {
            System.out.print("Nhap so luong hoc sinh: ");
            String s = sc.nextLine().trim();
            try {
                n = Integer.parseInt(s);
                if (n <= 0) {
                    System.out.println("So luong phai > 0. Nhap lai!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai dinh dang so. Nhap lai!");
            }
        }

        ds.clear();
        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Nhap hoc sinh thu " + (i + 1) + " --");
            HocSinh hs = new HocSinh();
            hs.nhap(sc);
            ds.add(hs);
        }
    }

    public void inDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("(Danh sach rong)");
            return;
        }
        System.out.println("\n=== DANH SACH HOC SINH ===");
        for (HocSinh hs : ds) hs.xuat();
    }

    public void sapXepGiamDanTheoDTB() {
        Collections.sort(ds, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh a, HocSinh b) {
                // giảm dần
                return Double.compare(b.getDiemTrungbinh(), a.getDiemTrungbinh());
            }
        });
    }

    public HocSinh timHocSinhDTBCaoNhat() {
        if (ds.isEmpty()) return null;
        HocSinh max = ds.get(0);
        for (HocSinh hs : ds) {
            if (hs.getDiemTrungbinh() > max.getDiemTrungbinh()) {
                max = hs;
            }
        }
        return max;
    }
}