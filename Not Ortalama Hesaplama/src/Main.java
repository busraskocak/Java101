import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişlenkeri oluştur.
        // Scanner Sınıfını yaz

int Mat, Fizik, Kimya, Turkce, Tarih, Muzik ;

Scanner input = new Scanner(System.in);
//Kullanıcı verilerini al
        System.out.println("Matematik Notunuzu Giriniz:");
        Mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        Fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        Kimya = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
        Turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        Tarih = input.nextInt();

        System.out.println("Müzik Notunuzu Giriniz:");
        Muzik = input.nextInt();

        double Toplam = (Mat + Fizik + Kimya + Turkce + Tarih + Muzik)/6;
        System.out.println("Ortalamanız :" + Toplam);

      String str = (60 < Toplam) ? "Sınıfı Geçtiniz." : " Sınıfta Kaldınız";
            System.out.println(str);




    }
}