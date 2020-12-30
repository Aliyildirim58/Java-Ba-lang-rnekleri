public class deneme2{
    public static void main(String[] args) {
      int i,j;
      char [][] A=new char[5][5];
      for(i=0;i<5;i++){
          for(j=0;j<5;j++){
              if(i==j || i+j==4){
                 A[i][j]='*';
              }
              else{
                 A[i][j]=' ';
              }
              System.out.printf("%2c",A[i][j]);

          }
          System.out.printf("\n");
      }
    }
}
