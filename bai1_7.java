import java.util.Scanner;

public class bai1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Vui long nhap so nguyen duong.");
        } else {
            int sqrtN = (int) Math.sqrt(n);
            if (sqrtN * sqrtN == n) {
                System.out.println(n + " la so chinh phuong.");
            } else {
                System.out.println(n + " khong phai la so chinh phuong.");
            }
        }
        scanner.close();
    }
}

//Kiem tra so chinh phuong