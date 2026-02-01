import java.util.Scanner;

public class bai1_8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap thang (1-12): ");
            int thang = scanner.nextInt();

            int soNgay;
            switch (thang) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    soNgay = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    soNgay = 30;
                    break;
                case 2:
                    System.out.print("Nhap nam: ");
                    int nam = scanner.nextInt();
                    if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                        soNgay = 29; // Nam nhuan
                    } else {
                        soNgay = 28; // Nam khong nhuan
                    }
                    break;
                default:
                    System.out.println("This month is invalid.");
                    return;
            }

            System.out.println("So ngay trong thang " + thang + " la: " + soNgay);
        }
    }
}

//Kiem tra so ngay trong thang
