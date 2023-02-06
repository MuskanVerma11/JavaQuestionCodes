import java.lang.Math.*;
import java.util.*;
class compoundInterest{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		double CI,P,R,T;
		System.out.print("Enter Principal Balance(in Rs.) : ");
		P=sc.nextDouble();
		System.out.print("Enter Rate of interest(in %) : ");
		R=sc.nextDouble();
		System.out.print("Enter Time Period(in years) : ");
		T=sc.nextDouble();
		CI=P*(Math.pow(1+R/100,T)-1);
		System.out.printf("CompountInterest = %.2f\n",CI);
		double final_amount=P+CI;
		System.out.printf("Final amount : %.2f",final_amount);
	}
}