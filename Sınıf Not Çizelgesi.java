//10 kişilik Sınıftaki öğrencilerin vizenin %50,Kısa sınav-1  %15,Kısa sınav-2 %15,Ödev %20 notlarının toplmamının %30u ile finalin %70 inin hesaplayan not ortalaması
public class deneme2{
    public static void main(String[] args) {
        double ort;
        double[][] A=new double[10][7];
        for(int i=0;i<=9;i++){
            A[i][0]=i+1;
         for(int j=1;j<=5;j++){
            A[i][j]=1+(int)(Math.random()*100);
         }
        ort=((A[i][1]*15)+(A[i][2]*15)+(A[i][3]*20)+(A[i][4]*50))*0.3/100+(A[i][5]*70/100);
         A[i][6]=Math.round(ort);

        }
        System.out.println("\t"+"No"+"\t"+"KS-1"+"\t"+"KS-2"+"\t"+"Ödev"+"\t"+"Vize"+"\t"+"Final"+"\t"+"Başarı Notu");
        for(int m=0;m<=9;m++){
            for(int k=0;k<=6;k++){
                System.out.print(" "+(A[m][k])+"\t");
            }
            System.out.println();
        }
    }
}
