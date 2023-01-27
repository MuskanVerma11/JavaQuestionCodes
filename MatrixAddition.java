import java.util.*;

class MatrixAddition{
	public static void main(String [] args){
		int m,n;
		System.out.print("Enter no. of rows in Matrices :");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		System.out.print("Enter no. of column in Matrices :");
		n=sc.nextInt();
		int matA[][]=new int[m][n];
		int matB[][]=new int[m][n];
		System.out.println("Enter Elements of Matrix A :");
		for(int i=0;i<m;i++){
			for(int j=0; j<n; j++){
				matA[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Elements of Matrix B :");
		for(int i=0;i<m;i++){
			for(int j=0; j<n; j++){
				matB[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of Marix A and Matrix B :");
		for(int i=0;i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print((matA[i][j]+matB[i][j])+ "  ");
			}System.out.println(" ");
		}
	}
}
