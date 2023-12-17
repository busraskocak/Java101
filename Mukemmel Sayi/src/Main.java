import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int total= 0;

        if (number>0){
            for (int i=1; i<number ; i++){
                if (number%i==0){
                    total +=i;
                }
            }
            if (total==number){
                System.out.println(number  + " Mükemmel Sayıdır.");
            }else {
                System.out.println(number + " Mükemmel Sayı Değildir.");
            }
        }else {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        }
    }
}