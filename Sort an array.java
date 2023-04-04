//1,23,56,236,34,782,5,2,8,21
//1,2,5,8

class sorting{
	public static void main(String [] args){
		int arr[]={1,23,56,236,34,782,5,2,8,21};
		int temp;
		System.out.println("Array Before sorting");
		for(int j=0; j<10; j++){
			System.out.print(arr[j]+ ",");
		}
		
		for(int l=0; l<10; l++){
			for(int i=0; i<9; i++){
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println("");
		System.out.println("Array After sorting");
		for(int k=0; k<10; k++){
			System.out.print(arr[k]+ ",");
		}
	}
}
