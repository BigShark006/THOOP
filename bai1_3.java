import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        if(laTamgiac(a, b, c)){
            if(laTamgiacDeu(a, b, c)){
                System.out.println("Deu");
            } else if(laTamgiacCan(a, b, c)){
                System.out.println("Can");
            } else {
                System.out.println("Vuong");
            }
        } else {
            System.out.println("Khong hop le");
        }
    }    


    public static boolean laTamgiac(int a, int b, int c){
    if ((a + b) > c && (a + c) > b && (b + c) > a) 
            return true;
        return false;
    }

    public static boolean laTamgiacCan(int a, int b, int c){
     if (a == b || b == c || c == a) 
            return true;
        return false;
    }

    public static boolean laTamgiacDeu(int a, int b, int c){
    if (a == b && b == c) 
            return true;
        return false;
    
    }

    public static boolean laTamgiacVuong(int a, int b, int c){
    if ((a*a + b*b) == c*c || (a*a + c*c) == b*b || (b*b + c*c) == a*a) 
            return true;
        return false;
    
    }
}
