import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limit;

        Scanner input= new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        limit= input.nextInt();
        int toplam=0;
        int adet=0;

        for (int i=0; i<=limit ; i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
                toplam += i;
                adet++;  //sayı 3 ve 4'e tam bölünürse adet bir artırılır ve toplama o sayı eklenir.


            }
        }
        //Ortalama Alma ve Sonuç Çıktısı

        if (adet>0){
            double ortalama= (double) toplam/adet;
            System.out.println("3'e ve 4'e Bölünen Sayıların Ortalaması :" + ortalama);
        }else{
            System.out.println("3'e ve 4'e Bölünen Sayı Bulunamadı.");
        }




    }
}