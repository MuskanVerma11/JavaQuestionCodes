import java.util.*;
class simpleInterest{
	public static void main(String []args){
		double SI;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter initial principal balance(in Rs.) : ");
		double P=sc.nextDouble();
		System.out.print("Enter Rate of Interest(in %) : ");
		double R=sc.nextDouble();
		System.out.print("Enter Time Period(in years) : ");
		double T=sc.nextDouble();
		SI=(P*R*T)/100;
		System.out.println("Simple Interest = " +SI);
		double final_amount = P+SI;
		System.out.println("Final Amount " +final_amount);
	}
}
