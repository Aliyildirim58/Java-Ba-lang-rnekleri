import java.util.Random;


public class deneme {
    public static void main(String[] args) {
        int sayaç = 0;
        int tut;
        Random rnd = new Random();
        int a = rnd.nextInt(100);
        int b = rnd.nextInt(100);

        if (a > b) {
            tut = a;
            a = b;
            b = tut;
        }
        if (a % 2 == 0) {
            for (int i = a; i < b; i += 2) {
                System.out.printf("%d ", i);
                sayaç++;
            }
        }

       else{

          for(int i=a+1;i<b;i+=2){
              System.out.printf("%d ",i);
              sayaç++;
          }
       }
        System.out.println(" " +sayaç+ " Adet Çift Sayı Var");

 }

}
