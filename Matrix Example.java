public class deneme2{
    public static void main(String[] args) {
      int i,j;
      int [][] A=new int[5][5];
      for(i=0;i<5;++i){
          for(j=0;j<5;++j){
              if(i<j){
                  A[i][j]=1;
              }
              else if(i==j){
                  A[i][j]=0;
              }
              else{
                  A[i][j]=-1;
              }
              System.out.printf("%d\t",A[i][j]);
          }
          System.out.printf("\n");
      }
    }
}
