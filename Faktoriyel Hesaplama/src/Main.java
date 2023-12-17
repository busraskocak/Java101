import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("n Değerini Giriniz :");
        int n = scan.nextInt();

        System.out.println("r Değerini Giriniz :");
        int r = scan.nextInt();

        //C(n,r) = n! / (r! * (n-r)!)
        int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int nMinusRFaktoriyel = 1;

        // n! hesapla
        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        // r! hesapla
        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }

        // (n-r)! hesapla
        for (int i = 1; i <= n - r; i++) {
            nMinusRFaktoriyel *= i;
        }

        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}




