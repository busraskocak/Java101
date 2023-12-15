import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password,newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("Patika")&& password.equals("Java123")){
            System.out.println("Giriş Yaptınız.");
        }else {
            System.out.println("Bilgileriniz Yanlış.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır):");
            newPassword=input.nextLine();





            }
        }

    }
