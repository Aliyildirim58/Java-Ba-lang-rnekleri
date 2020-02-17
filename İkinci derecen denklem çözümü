import java.util.Scanner;
import static java.lang.StrictMath.pow;
public class deneme2{
    public static  void main(String[] args) {
       double a,b,c,delta,kökdelta,x,v,z;
       System.out.println("Sırayla katsayıları giriniz:");
        Scanner ab=new Scanner(System.in);
        a=ab.nextDouble();
        b=ab.nextDouble();
        c=ab.nextDouble();
       delta=pow(b,2)-4*a*c;
       kökdelta=pow(delta,0.5);
        System.out.println("delta: "+ delta +" Kökdelta " + kökdelta);
        if(delta<0){
            System.out.println("Reel kök yok "); }
        else if (delta==0){
            System.out.println("Çift katlı kök var");
            x=((-b)-kökdelta)/2*a;
            System.out.println("Kökün"+x); }
        else{
            v=((-b)-kökdelta)/2*a;
            z=((-b)+kökdelta)/2*a;
            System.out.println("Birinci kök"+v);
            System.out.println("ikinci kök"+z); } }}
