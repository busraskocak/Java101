import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n= input.nextInt();
        int number1=0;
        int number2= 1;
        int total;

        System.out.println(n + "Sayısının Fibonacci Serisi : ");

        for (int i=1; i<=n; i++){
            System.out.print(number1 + ",");
            total=number1 + number2;
            number1=number2;
            number2=total;


        }
    }
}