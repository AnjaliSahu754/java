import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {

		callRectangle();
	}

	private static void callRectangle() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		int l = sc.nextInt();
		
		System.out.println("Enter breadth : ");
		int b = sc.nextInt();
		
		Rectangle r1 = new Rectangle(l, b);
		
		
		
		System.out.println(r1);
	}

}