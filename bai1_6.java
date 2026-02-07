import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Countless");
                } else {
                    System.out.println("None");
                }
            } else {
                double x = -c / b;
                System.out.printf("%.2f " , x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("None");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("%.2f " , x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("%.2f " , x1);
                System.out.printf("%.2f " , x2);
            }
        }
        scanner.close();
    }
}

