import java.util.*;
class LogicGates{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input A -");
		int A=sc.nextInt();
		System.out.println("Enter input B -");
		int B=sc.nextInt();
		System.out.println("AND gate Output for A=" +A+ " and B=" +B);
		System.out.println(A*B);
		System.out.println("OR gate Output for A=" +A+ " and B=" +B);
		if(A==1 && B==1){
		System.out.println("1");
		}else System.out.println(A+B);
		System.out.println("NAND gate Output for A=" +A+ " and B=" +B);
		if(A*B==1){
			System.out.println("0");
		}else System.out.println("1");
		System.out.println("NOR gate Output for A=" +A+ " and B=" +B);
		if(A+B==1 || A==1 && B==1){
			System.out.println("0");
		}else System.out.println("1");
	}
}