import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Kullanıcı Verilerini Al.

        System.out.println("Birinci Sayıyı Giriniz:");
        int a = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        int b = input.nextInt();
        System.out.println("Üçüncü Sayıyı Giriniz");
        int c = input.nextInt();

        //Sonuç Kısmını ekle
        int sonuc=  a+b*c-b;
        System.out.println("Sonuç:" + sonuc);

    }
}