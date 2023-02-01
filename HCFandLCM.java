import java.util.*;
class HCFandLCM{
    public static void main(String []args){
        int a,b,hcf=0,i;
        int min=0;
        int lcm=0;
        System.out.print("Enter first number :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("Enter second number :");
        b=sc.nextInt();
        if(a<b){
            min=a;
        }else min=b;
        for(i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }System.out.println("HCF of given numbers is = " +hcf);
        lcm=(a*b)/hcf;
        System.out.println("LCM of given numbers is = " +lcm);
    }
}