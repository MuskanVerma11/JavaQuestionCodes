import java.util.*;
class NeonNumber{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int r,sum=0;
		int sq=n*n;
		while(sq>0){
			r=sq%10;
			sum+=r;
			sq=sq/10;			
		}
		if(sum==n){
			System.out.println("Neon Number");
		}else System.out.println("Not a Neon Number");
	}
}
