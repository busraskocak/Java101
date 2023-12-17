import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        int tekciftsayi =0; //Toplam tek ve çift sayı
        //Kullanıcıdan değer al.
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz : ");
            n = scan.nextInt();
            if ((n%2==0) && (n%4==0)){ //Çift ve dördün katı
                tekciftsayi += n;
            }
        }while (n%2 !=1); // Tek Sayı Bulana kadar devam et
        System.out.println("Çift ve 4'ün katları olan sayıların toplamı: "+ tekciftsayi);

    }
}