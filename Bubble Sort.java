public class deneme2{
    final static int n=8;
    public static void main(String[] args) {
       int[] dizi={5,7,1,9,6,3,0,4};
       int i,j,enk;
       for(i=0;i<n;i++){
           for(j=i+1;j<n;j++){
               if(dizi[i]<dizi[j]){
                 enk=dizi[i];
                 dizi[i]=dizi[j];
                 dizi[j]=enk;
               }
          }
       }
        for(i=0;i<8;i++){
            System.out.printf("%d",dizi[i]);
        }
    }
}
