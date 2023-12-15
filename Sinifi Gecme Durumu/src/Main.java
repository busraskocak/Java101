import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,dnotu;



        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=input.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce=input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=input.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik=input.nextInt();

       double average= (mat + fizik + turkce + kimya + muzik) /5;
       if (average<55){
           System.out.println("Sınıfta Kaldınız:");
           System.out.println("Ortalamanız:" + average);
       }
        if (average<0 || average>100) {
            System.out.print("Notunuz Geçersiz:");

        }else{
           System.out.println("Sınıfı Geçtiniz:");
           System.out.println("Ortalama:" + average);
       }

       }

       }
