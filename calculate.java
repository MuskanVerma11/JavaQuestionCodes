import java.util.*;

class calculate{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc1.nextInt();
		System.out.println(+a+ "+" +b+ "=" +(a+b));
		System.out.println(+a+ "-" +b+ "=" +(a-b));
		System.out.println(+a+ "X" +b+ "=" +(a*b));
		System.out.println(+a+ "/" +b+ "=" +(a/b));
		System.out.println(+a+ "mod" +b+ "=" +(a%b));
	}
}