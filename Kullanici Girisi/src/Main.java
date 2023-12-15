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
            String secimisifirla = input.nextLine();

            if (secimisifirla .equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                newPassword = input.nextLine();

                // Yeni şifre, eski şifre ve kullanıcı adı ile farklı olmalı
                if (!newPassword.equals(password) && !newPassword.equals(userName)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }





            }
