import java.util.*;
import java.math.*;

class BinaryToDecimal{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number -");
		int a=sc.nextInt();
		int b=a;
		int dec[]=new int[1000];
		System.out.println("Decimal Number -");
		int r;
		int i=0;
		int sum=0;
		while(b>0){
			b=b/10;
			i++;
		}

		for(int j=0;j<i;j++){
			r=a%10;
			sum+=r*Math.pow(2,j);
			a=a/10;
		}System.out.println(sum);
	}
}
