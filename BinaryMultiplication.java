import java.util.*;

class BinaryMultiplication{
	public static void main(String args[]){
		int i,j,k,l;
		int a,b;
		int mul;	
		Scanner sc=new Scanner(System.in);
		System.out.println("###Binary Multiplication for 1 bit###");
		System.out.println("#Enter first binary number-#");
		a=sc.nextInt();
		System.out.println("#Enter second binary number-#");
		b=sc.nextInt();	
		
		if(a!=0 && a!=1 || b!=0 && b!=1)
			{ 
		System.out.println("wrong inputs found , please enter binary numbers(0 & 1)");
}
	else{
		System.out.println("Multiplication of binary numbers = ");
		if(a==0 && b==0){
			mul=0;
		System.out.print(mul);
	}
		if(a==0 && b==1){
			mul=0;
		System.out.print(mul);
	}
		if(a==1 && b==0){
			mul=0;
		System.out.print(mul);
	}	if(a==1 && b==1){
			mul=1;
		System.out.print(mul);
	}

} 		
	}
}
