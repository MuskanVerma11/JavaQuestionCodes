import java.util.*;
class MatrixMultiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows in matrix A :");
        int row1=sc.nextInt();
        System.out.print("Enter no. of columns in matrix A :");
        int col1=sc.nextInt();
        System.out.print("Enter no. of rows in matrix B :");
        int row2=sc.nextInt();
        System.out.print("Enter no. of columns in matrix B :");
        int col2=sc.nextInt();
        int matA[][]=new int[row1][col1];
        int matB[][]=new int[row2][col2];
	int matR[][]=new int[row1][col2];
        if(col1==row2){
            System.out.println("Enter Elements of matrix A :");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements of matrix B :");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                matB[i][j]=sc.nextInt();
            }
        }
	for(int i=0;i<row1;i++){
		for(int j=0;j<col2;j++){
				matR[i][j]=0;
			for(int k=0;k<col1;k++){
				matR[i][j]+=matA[i][k]*matB[k][j];
			}System.out.print(matR[i][j]+ "  ");
		}System.out.println();
	}
    }else System.out.println("Multiplication of given matrices is not possible!");
    }
}