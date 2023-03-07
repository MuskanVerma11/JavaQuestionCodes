import java.util.*;

class DecimalToOctal{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Decimal Number : ");
	int a=sc.nextInt();
	int r[]=new int[1000];
	int i=0;
	System.out.println("Octal -");
	while(a>0){
		r[i]=a%8;
		a=a/8;
		i++;}
	for(int j=i-1; j>=0; j--){
			System.out.print(r[j]);
		}		
	}
}
