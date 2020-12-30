//Bilgisayar tarafından random tutulan sayıyı bulma
import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        int sayaç=0;
        int kullanıcı;


        System.out.println("Bir sayı giriniz");
        Scanner ab=new Scanner(System.in);

        int tut=(1+(int)(Math.random()*100));
        do {
            kullanıcı = ab.nextInt();
            sayaç++;

            if (kullanıcı == tut) {
                System.out.println("Tebrikler sayıyı buldunuz.");
                System.out.println(" "+ sayaç + " Tahminde bildiniz");

            }
            else if (kullanıcı > tut) {
                System.out.println("Lütfen daha küçük bir sayı giriniz");

            } else System.out.println("Lütfen daha büyük bir sayı giriniz");




        }
        while (kullanıcı!=tut);



}
}
