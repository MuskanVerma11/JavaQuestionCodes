import java.util.*;
class searchInArray{
	public static void main(String [] args){
		int arr[]=new int[]{ 1,345,32,56,23,72,21,7,3,0 };
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		int index=0;
		for(int i=0;i<10;i++){
			if(arr[i]==n){
				count=1;
				index=i;
				break;
			}
		} 
		if(count==1){ 
			System.out.println("Number found at index " +index);
		}else System.out.println("Number not found");
	}
}
