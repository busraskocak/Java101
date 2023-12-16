import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();

        //Yıl 4'e tam bölünebiliyorsa, artık yıldır.
        //Yıl 400'e tam bölünebiliyorsa, artık yıldır.
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0 )) {
            System.out.print("Artık Bir Yıldır.");
        } else {
            System.out.print("Artık Yıl Değildir.");
        }

    }
}
