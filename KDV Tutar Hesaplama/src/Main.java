import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        double tutar = scanner.nextDouble();

        double kdvOrani;

        if (tutar > 1000) {
            kdvOrani = 0.08;
        } else {
            kdvOrani = 0.18;
        }

        double kdvTutari = tutar * kdvOrani;
        double toplamTutar = tutar + kdvTutari;

        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("Toplam Tutar: " + toplamTutar);
    }
}