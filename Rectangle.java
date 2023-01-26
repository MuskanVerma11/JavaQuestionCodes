class Rectangle{
	public static void main(String args[]){
		double width=5.5;
		double length=8.5;
		double area=width*length;
		double perimeter=2*(width+length);
		System.out.println("Area is " +width+ "X" +length+ "=" +area);
		System.out.println("Perimeter is " +perimeter);
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", length, width, perimeter);
	        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, length, area);

	}
}

