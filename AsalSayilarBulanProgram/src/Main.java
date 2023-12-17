import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();
        boolean asal = true;

        if (number < 2) {
            asal = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println(number + " Asaldır");
        } else {
            System.out.println(number + " Asal değildir.");
        }
    }
}
