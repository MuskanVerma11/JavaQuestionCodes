import java.util.*;

class tablePrint{
	public static void main(String args[]){
		Scanner str=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=str.nextInt();
		
	int i;
	for(i=1; i<11; i++){
		System.out.println(+a+ "X" +i+ "=" +(a*i));
	}

	}
}