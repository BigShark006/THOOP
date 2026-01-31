import java.util.Scanner;

public class bai1_3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong a: ");
        a = sc.nextInt();
        System.out.print("Nhap so nguyen duong b: ");  
        b = sc.nextInt();
        System.out.print("Nhap so nguyen duong c: ");
        c = sc.nextInt();
        sc.close();

        if(laTamgiac(a, b, c)){
            System.out.println("3 so vua nhap tao thanh 1 tam giac");
            if(laTamgiacDeu(a, b, c)){
                System.out.println("Tam giac deu");
            } else if(laTamgiacCan(a, b, c)){
                System.out.println("Tam giac can");
            } else {
                System.out.println("Tam giac vuong");
            }
        } else {
            System.out.println("3 so vua nhap khong tao thanh 1 tam giac");
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

//Nhap 3 so nguyen duong --> can, vuong, deu
