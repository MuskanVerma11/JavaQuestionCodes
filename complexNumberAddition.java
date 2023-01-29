import java.util.*;
class complexNumberAddition{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first complex number -");
		System.out.print("Real Part = ");
		int x1=sc.nextInt();
		System.out.print("Imaginary Part = ");
		int y1=sc.nextInt();
		System.out.println("Enter second complex number -");
		System.out.print("Real Part = ");
		int x2=sc.nextInt();
		System.out.print("Imaginary Part = ");
		int y2=sc.nextInt();
		System.out.print("Addition of Complex Numbers =");
		System.out.println((x1+x2)+ "+" +(y1+y2)+ "i");
	}
}