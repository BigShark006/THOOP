import java.util.Scanner;

public class bai1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Loi: Vui long nhap so nguyen duong.");
        } else {
            int daoNguoc = 0;
            while (n != 0) {
                int chuSo = n % 10;
                daoNguoc = daoNguoc * 10 + chuSo;
                n /= 10;
            }
            System.out.println("So dao nguoc: " + daoNguoc);
        }

        scanner.close();
    }
}

//Dao nguoc so nguyen duong nhap tu ban phim