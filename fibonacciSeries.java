//fibonacci Series 
//0 , 1 , 0+1 , 1+1, 3

import java.util.*;
class fibonacciSeries{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of terms : ");
		int n=sc.nextInt();
		int num1=0, num2=1;	
		int count=0;
		while(count<n){
			System.out.print(num1+ ",");
			int num3=num2+num1;
			num1=num2;
			num2=num3;
			count=count+1;
		}
	}
}

//while loop 2
//0,1,1
//num3=3
//num1=2
//num2=3
//count =3