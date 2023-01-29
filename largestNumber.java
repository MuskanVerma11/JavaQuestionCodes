import java.util.*;
class largestNumber{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number a=");
		int a=sc.nextInt();
		System.out.print("Enter number b=");
		int b=sc.nextInt();
		System.out.print("Enter number c=");
		int c=sc.nextInt();

		if(a>b && a>c){
			System.out.println(a+ " is the largest among given three numbers.");
		}else if(b>a && b>c){
			System.out.println(b+ " is the largest among given three numbers.");
		}else System.out.println(c+ " is the largest among given three numbers.");
	}
}