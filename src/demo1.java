import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a = NhapSo("Nhap he so a : ");
        b = NhapSo("Nhap he so b : ");
        c = NhapSo("Nhap he so c : ");
        GPTB2(a, b, c);
    }

    private static int NhapSo (String str)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x = sc.nextInt();
        return x;
    }

    private static void GPTB2(int a, int b, int c) {
        double x1, x2;
        double delta = Math.pow(b, 2) - 4*a*c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co nghiem x1= "+ x1);
            System.out.println("Phuong trinh co nghiem x2= "+ x2);
        } else {
            System.out.println("Phuong trinh co nghiem kep x1=x2= "+(-b/(2*a)));
        }
    }
}
