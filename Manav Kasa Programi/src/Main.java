import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Ürün Fiyatları;
        double armutFiyat =2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlicanFiyat=5;
        // Veri al
        Scanner input= new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = input.nextDouble();


        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) +
                (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) +
                (patlicanFiyat * patlicanKilo);


        System.out.println("Toplam Tutar: " + toplamTutar + " TL");


    }
}