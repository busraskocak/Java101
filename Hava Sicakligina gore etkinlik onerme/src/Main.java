import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklığı Giriniz:");
        heat = inp.nextInt();


        if (heat < 5) {//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat >= 5 && heat<= 15) { //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if ( heat >15 && heat<= 25) {//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
            System.out.println("Piknik Yapmaya Gidebilirsiniz.");
        } else{//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }


    }
}