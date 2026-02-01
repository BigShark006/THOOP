import java.util.Scanner;

public class bai1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen co hai chu so: ");
        int number = scanner.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("Loi: Vui long nhap so nguyen co hai chu so.");
        } else {
            int tens = number / 10;
            int units = number % 10;

            String[] soChu = {
                "Khong", "Mot", "Hai", "Ba", "Bon",
                "Nam", "Sau", "Bay", "Tam", "Chin"
            };

            String result = soChu[tens] + " muoi";
            if (units != 0) {
                result += " " + soChu[units];
            }

            System.out.println("Cach doc: " + result);
        }

        scanner.close();
    }
}

//Doc so nguyen 2 chu so nhap tu ban phim bang chu