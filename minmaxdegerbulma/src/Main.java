import javax.swing.text.Style;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int n= input.nextInt();

        int min=0;
        int max=0;

        for (int i=1; i<=n; i++){
            System.out.print(i+ " . Sayıyı Giriniz : ");
            int number=input.nextInt();
            if (number<min || min==0){
                min=number;
            }
            if (number>max){
                max=number;

            }
        }
        System.out.println("Girilen Sayılar arasından en küçük sayı : " + min);
        System.out.println("Girilen Sayılar arasından en büyük sayı : " + max);

    }
}