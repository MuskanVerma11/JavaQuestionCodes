import java.util.*;

class DecimalToHexadecimal{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Decimal Number : ");
	int a=sc.nextInt();
	int r[]=new int[1000];
	int i=0;
	System.out.println("Hexa decimal -");
	while(a>0){
		r[i]=a%16;
		a=a/16;
		i++;}
	for(int j=i-1; j>=0; j--){
			if(r[j]>9){
			if(r[j]==10){System.out.print("A");}
			if(r[j]==11){System.out.print("B");}
			if(r[j]==12){System.out.print("C");}
			if(r[j]==13){System.out.print("D");}
			if(r[j]==14){System.out.print("E");}
			if(r[j]==15){System.out.print("F");}
}else System.out.print(r[j]);
		}		
	}
}
