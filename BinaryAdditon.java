//2 bit Binary Addition//
import java.util.*;

class BinaryAddition{
	public static void main(String args[]){
		int i,j,k,l;
		int a[]=new int[2];
		int b[]=new int[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("###Binary addition for 2 bit###");
		System.out.println("#Enter first binary number-#");
		for(j=0;j<a.length;j++){
		System.out.println("Enter " +j+ " bit of binary number");
		a[j]=sc.nextInt();
	}
		
		System.out.println("#Enter second binary number-#");
		for(k=0;k<b.length;k++){
		System.out.println("Enter " +k+ " bit of binary number");
		b[k]=sc.nextInt();
	}
		
		int sum[]=new int[2];
		for(i=0;i<sum.length;i++){
			if(a[i]!=0 && a[i]!=1 || b[i]!=0 && b[i]!=1)
			{ 
		System.out.println("wrong inputs found , please enter binary numbers(0 & 1)");
		}else{
			if(a[i]==0 && b[i]==0){
				sum[i]=0;

		}
			if(a[i]==0 && b[i]==1){
				sum[i]=1;
		}
			if(a[i]==1 && b[i]==0){
				sum[i]=1;
		}	
			if(a[i]==1 && b[i]==1){
				sum[i]=10;
		}
		
	}
}	System.out.println("Sum of binary numbers = "); 
	for(l=0;l<sum.length;l++){
		System.out.print(sum[l]);}		
	}
}
