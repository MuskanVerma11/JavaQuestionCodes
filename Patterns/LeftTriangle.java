import java.util.*;
class LeftTriangle{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of lines : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");}
					for(int k=0;k<=i;k++){
						System.out.printf("*");
			}System.out.printf("\n");
		}
	}
}