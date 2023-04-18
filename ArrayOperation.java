import java.util.*;
class ArrayOperation{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements in Array-");
		int n=sc.nextInt();
		System.out.println("Enter Array Elements-");
		int arr[]=new int[n+1];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Display Array-");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		System.out.println("Reverse of Array-");
		for(int i=n-1; i>=0; i--){
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		System.out.println("Which Element do you want to delete?");
		int del=sc.nextInt();
		int count=0;
		int index=0;
		for(int i=0; i<n; i++){
			if(arr[i]==del){
				count=1;
				index=i;
			while(index+1!=n){
			arr[index]=arr[index+1];
			index++;
				}arr[index]=0;
			}
		}
		if(count==1){
			System.out.println("Array after deletion-");
			for(int j=0; j<n; j++){
			System.out.print(arr[j]+ " ");
			}	
		}else System.out.println("Element not found in array");
		System.out.println("");
		System.out.println("Enter element to insert-");
		int element=sc.nextInt();
		System.out.println("Enter position where you want to insert the element-");
		int pos=sc.nextInt();
		if(pos<n+1){
		for(int i=n; i>pos; i--){
			arr[i]=arr[i-1];
		}
		arr[pos]=element;
		System.out.println("Array After insertion-");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
			}
		}else System.out.println("Element can't be inserted at given position, position should be less than array size");
	}
}


/*n=5
array size =6
array- 1,2,3,4,5
display - 1,2,3,4,5
reverse- 5,4,3,2,1
del =3
count =0
index=2
arr[2]=arr[3]
arr[3]=arr[4]
array - 1,2,4,5,0
*/