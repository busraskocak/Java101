import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan değerleri al.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {


            for (int k = 1; k <= (n - i); k++) { //Döngüde boşluk asayıları oluşturuldu.
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) { //Yıldız bastırmak için oluşturulan kod
                System.out.print("*");
            }


            System.out.println();
        }
        // Alt kısmı oluşturmak için;
        for (int i=n-1;i>=1; i--){
            for (int k = 1; k <= (n - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}