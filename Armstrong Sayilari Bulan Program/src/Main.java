import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;
        int total = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;

        }
        tempNumber = number;
        //Her sayının basamaklarının üslerinin toplamanın hesabı
        while (tempNumber != 0) {

            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
            total += basValue;


        }
        if (result == number) {
            System.out.println( number + "Sayısı bir Armstrong Sayısıdır");
        } else {
            System.out.println( number + "sayısı bir Armstrong sayı değildir.");
        }

        System.out.println("Basamak Sayıları Toplamı" + total);


    }
}