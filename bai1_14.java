import java.util.Scanner;

public class bai1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Loi: Vui long nhap so nguyen duong.");
        } else {
            long tong = 0;
            long giaiThua = 1;

            for (int i = 1; i <= n; i++) {
                giaiThua *= i; // Tinh i!
                tong += giaiThua; // Cộng i! vào tổng
            }

            System.out.println("Tong Sn = 1 + 1.2 + 1.2.3 + ... + 1.2.3...n la: " + tong);
        }

        scanner.close();
    }
}

//Tinh tong: Sn = 1 + 1.2 + 1.2.3 + ... + 1.2.3...n