import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayı :");
        a=input.nextInt();
        System.out.print("2.Sayı:");
        b=input.nextInt();
        System.out.print("3.Sayı:");
        c=input.nextInt();

        if ((a<b)&& (a<c)){
            if (b<c){
                System.out.print("a<b<c");
            }else {
                System.out.println("a<c<b");
            }

        } else if ((b<a) && (b<c)){
                if (a<c){
                    System.out.println("b<c<a");
                }else{
                    System.out.println("b<a<c");
                }

            }//YÜKLEMEDEN ÖNCE KONTROL ET İFLERİNDE SIKINTI VAR

        }

    }

}