import java.util.Scanner;
public class bai1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered: " + number);

        System.out.print("Enter a float: ");
        float myFloat = input.nextFloat();
        System.out.println("You entered: " + myFloat);

        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("You entered: " + myDouble);

        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered: " + myString);

        input.close();
    }
}

//Nhap tu ban phim --> in ra man hinh
