import java.util.Scanner;

public class bai1_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu cao cua tam giac: ");
        int height = scanner.nextInt();

        System.out.println("Tam giac vuong:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Tam giac can:");
        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

//In ra tam giac vuong va tam giac can voi chieu cao nhap tu ban phim