import java.util.Scanner;

public class bai1_10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap nam can kiem tra: ");
            int nam = scanner.nextInt();

            boolean isNamNhuan;
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                isNamNhuan = true;
            } else {
                isNamNhuan = false;
            }

            if (isNamNhuan) {
                System.out.println(nam + " la nam nhuan.");
            } else {
                System.out.println(nam + " khong phai la nam nhuan.");
            }
        }
    }
}

//Tinh nam nhuan theo quy tac:
//- Nam nhuan la nam chia het cho 4
//- Nam nhuan khong chia het cho 100