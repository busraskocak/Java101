import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      /* for (int i=1;i<=10;i++){
           if (i==5){
               continue;
           }
           System.out.println(i);

       }
    } */

       /* int i =1;
        while (i<=10){
            i++;
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }*/
        /*for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        }*/


/*
                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir sayı girin: ");
                int limit = scanner.nextInt();

                int toplam = 0;
                int adet = 0;

                for (int i = 0; i <= limit; i++) {
                    if (i % 3 == 0 && i % 4 == 0) {
                        toplam += i;
                        adet++;
                    }
                }

                if (adet > 0) {
                    double ortalama = (double) toplam / adet;
                    System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
                } else {
                    System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
                }
*/


        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        //4'ün katı,100'ün katı ve 400'ün katı olan yılları artık yıl verecek şekilde yazdım.
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır.");
                    //bu koşulu karşılamayan yılların artık yıl olmadığı çıktısını verecek şekilde yazdım.
                } else {
                    System.out.println(yil + " bir artık yıl değildir.");
                }
            }
            //4'e bölünmeyi  karşılamayan yılların bağladım.
        } else {
            System.out.println(yil + " artık bir yıl değildir.");
        }


    }

}







