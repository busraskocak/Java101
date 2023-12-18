import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan tam sayı ve ondalıklı sayı girişi alınması
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tam sayı giriniz: ");
        int intNumber = scanner.nextInt();

        System.out.print("Ondalıklı sayı giriniz: ");
        double doubleNumber = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürme
        double Double = (double) intNumber;

        // Ondalıklı sayıyı tam sayıya dönüştürme
        int Integer = (int) doubleNumber;

        // Sonuçları ekrana yazdırma
        System.out.println("Girilen tam sayı: " + intNumber);
        System.out.println("Girilen ondalıklı sayı: " + doubleNumber);
        System.out.println("Tam sayıyı ondalıklıya dönüştürme sonucu: " + Double);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme sonucu: " + Integer);


        scanner.close();
    }
}
