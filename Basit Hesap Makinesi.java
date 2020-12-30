import java.util.Scanner;
public class deneme2 {
    public static void menü() {
        System.out.println("Toplama:1");
        System.out.println("Çıkarma:2");
        System.out.println("Çarpma:3");
        System.out.println("Bölme:4");

    }

     static double hesapla(double x, double z, int w) {
        double s=0;
        switch (w) {
            case 1:
               s= x + z;
            break;
            case 2:
               s = x - z;
            break;
            case 3:
               s= x * z;
            break;
            case 4:
              s= x / z;
            break;
        }
        return s;

    }

    public static void main(String[] args) {
        double sonuç;
        char cevap;
        do {
            menü();
            System.out.println("Birici sayıyı giriniz:");
            int a = new Scanner(System.in).nextInt();
            System.out.println("İkinci sayıyı giriniz:");
            int b = new Scanner(System.in).nextInt();
            System.out.println("İşlem:");
            int islem = new Scanner(System.in).nextInt();
            sonuç = hesapla(a, b, islem);
            System.out.println("Sonuç:" + sonuç);
            System.out.println("Devam mı?[E/H]");
            cevap=new Scanner(System.in).next().charAt(0);

        }
        while (cevap=='e' || cevap=='E');
    }
}

