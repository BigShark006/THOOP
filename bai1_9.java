import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double soKm = scanner.nextDouble();

            double tienCuoc;
            if (soKm <= 0) {
                return;
            } else if (soKm <= 1) {
                tienCuoc = 5000;
            } else if (soKm <= 30) {
                tienCuoc = 5000 + (soKm - 1)* 5 * 800;
            } else {
                tienCuoc = 5000 + 29 * 5 * 800 + (soKm - 30) * 3000;
            }

            System.out.println(Math.round(tienCuoc));
        }
    }
}

