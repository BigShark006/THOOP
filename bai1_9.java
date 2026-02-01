import java.util.Scanner;

public class bai1_9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so km da di: ");
            int soKm = scanner.nextInt();

            int tienCuoc;
            if (soKm <= 0) {
                System.out.println("So km khong hop le.");
                return;
            } else if (soKm <= 1) {
                tienCuoc = 5000;
            } else if (soKm <= 30) {
                tienCuoc = 5000 + (soKm - 1) * 4000;
            } else {
                tienCuoc = 5000 + 29 * 4000 + (soKm - 30) * 3000;
            }

            System.out.println("Tien cuoc taxi la: " + tienCuoc + " VND");
        }
    }
}

//Tinh tien cuoc taxi
