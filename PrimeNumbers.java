import java.util.*;
class PrimeNumbers{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for n :");
		int n=sc.nextInt();
		int flag;
		System.out.println("Prime Numbers between 1 to " +n);
		for(int i=1;i<=n;i++){
			if(i==1 || i==0){
		 	continue;
			}flag=1;

			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=0;
					break;
				}
			}if(flag==1){
				System.out.print(i+ " ");			
			}
		}
	}
}