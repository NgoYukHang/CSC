public class Rectangle{
	public static void main(String[] args){
		// Welcome message
		System.out.println("This is a program to find area and perimeter of rectangle with width of 5.5 and height of 7.6");
		
		// Init
		float width=5.5f, height=7.6f, area, perimeter;

		// Calculate of area and perimeter
		area = width*height;
		perimeter = 2*(width+height);

		// Display result
		System.out.println("The height of rectangle is " + height);
		System.out.println("The width of rectangle is " + width);
		System.out.println("The area of rectangle is " + area);
		System.out.println("The perimeter of rectangle is " + perimeter);
	}
}
