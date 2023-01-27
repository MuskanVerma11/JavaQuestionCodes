import java.util.*;

class Matrix{
	public static void main(String [] args){
		int m,n;
		System.out.print("Enter no. of rows in Matrix :");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		System.out.print("Enter no. of column in Matrix :");
		n=sc.nextInt();
		int mat[][]=new int[m][n];
		System.out.println("Enter Elements of Matrix :");
		for(int i=0;i<m;i++){
			for(int j=0; j<n; j++){
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print(mat[i][j]+ " ");
			}System.out.println(" ");
		}
	}
}
