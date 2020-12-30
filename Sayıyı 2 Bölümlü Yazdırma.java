import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        int t;
        System.out.println("Bir değer girin:");
        Scanner ab=new Scanner(System.in);

        t=ab.nextInt();

        int[] dizi=new int[t];
        for(int i=0;i<t;i++){
            if(i<t/2){
                dizi[i]=i;

            }
            else{
                dizi[i]=(t-1)-i;

            }
            System.out.printf(" "+dizi[i]);
        }

    }

}


