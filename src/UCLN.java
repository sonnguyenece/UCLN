import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a, b;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Nhap vao so thu nhat : ");
            a = Math.abs(scn.nextInt());
            System.out.println("Nhap vao so thu hai : ");
            b = Math.abs(scn.nextInt());
            if (a == 0 && b == 0) System.out.printf("Khong co UCLN!");
            if (a == 0 && b != 0) System.out.printf("UCLN cua %d va %d la : %d%n%n", a, b, b);
            else if (a != 0 && b == 0) System.out.printf("UCLN cua %d va %d la : %d%n%n", a, b, a);
            else {
                for (int i = a; i >= 1; i--) {
                    if (a % i == 0) {
                        if (b % i == 0) {
                            System.out.printf("UCLN cua %d va %d la : %d %n%n", a, b, i);
                            break;
                        }
                    }
                }
            }
        } while (a != 0 || b != 0);
    }
}
