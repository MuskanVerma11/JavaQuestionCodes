class swap{
	public static void main(String [] args){
		int a=5;
		int b=2;
		int temp;
		System.out.printf("Numbers before swapping: a=%d and b=%d\n" ,a,b);
		temp =a;
		a=b;
		b=temp;
		System.out.printf("Numbers after swapping: a=%d and b=%d\n" ,a,b);
	}
}
