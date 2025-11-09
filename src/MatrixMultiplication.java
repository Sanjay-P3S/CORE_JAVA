public class MatrixMultiplication {
    public static void  main(String[] args){
        System.out.println("MatrixMultiplication");
        int[][] a= {{1,2},{1,2}};
        int[][] b= {{1,2},{1,2}};
        int[][] c= new  int[a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               for(int k=0;k<a[0].length;k++){
                   c[i][j]=(a[i][k]*b[k][j]);
               }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
            }


        }
    }

