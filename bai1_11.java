import java.util.Scanner;

public class bai1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap phep tinh (+, -, *, /): ");
        char phepTinh = scanner.next().charAt(0);

        double ketQua;

        switch (phepTinh) {
            case '+':
                ketQua = a + b;
                System.out.println("Ket qua: " + ketQua);
                break;
            case '-':
                ketQua = a - b;
                System.out.println("Ket qua: " + ketQua);
                break;
            case '*':
                ketQua = a * b;
                System.out.println("Ket qua: " + ketQua);
                break;
            case '/':
                if (b != 0) {
                    ketQua = a / b;
                    System.out.println("Ket qua: " + ketQua);
                } else {
                    System.out.println("Loi: Khong the chia cho 0.");
                }
                break;
            default:
                System.out.println("Loi: Phep tinh khong hop le.");
        }

        scanner.close();
    }
}

//Tinh tong hai so a va b nhap tu ban phim theo phep tinh +, -, *, /
