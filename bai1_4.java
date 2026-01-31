import java.util.Scanner;

public class bai1_4 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot ky tu: ");
        ch = sc.next().charAt(0);
        sc.close();

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("CHUHOA");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("CHUTHUONG");
        } else if (ch >= '0' && ch <= '9') {
            int digit = ch - '0';
            if (digit % 2 == 0) {
                System.out.println("SOCHAN");
            } else {
                System.out.println("SOLE");
            }
        } else {
            System.out.println("Ky tu khong phai chu cai hoac chu so");
        }
    }
}  

//Nhap 1 ky tu --> kiem tra chu hoa, chu thuong, so chan, so le 
