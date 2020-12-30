//Eklemeli Sıralama

public class deneme2 {
    final static int n=10;
    public static void main(String[] args) {
        int ekle,i;
        int A[]={2,3,1,8,9,4,7,0,5,6};

        for( i=0;i<n;i++){
            ekle=A[i];
            while (i>0 && A[i-1]<ekle){
                A[i]=A[i-1];
                i=i-1;

            }
            A[i]=ekle;
        }
        System.out.println("Sıralı Hali:");
        for(i=0;i<n;i++){
            System.out.printf("%d",A[i]);
        }
    }

}


