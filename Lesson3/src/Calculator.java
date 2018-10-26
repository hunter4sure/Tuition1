import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		while (true) {

			System.out.println("ENTER 1 TO ADD, 2 TO SUBTRTACT, 3 TO DIVIDE, 4 TO MULTIPLY");

			Scanner c = new Scanner(System.in);

			int input = c.nextInt();

			int a;
			int b;

			switch (input) {

			case 1:

				System.out.println("Enter  numbers to add:");
				a = c.nextInt();
				b = c.nextInt();
				System.out.println(a + " + " + b + " = " + addition(a,b));
				break;
			case 2:
				System.out.println("Enter  numbers to sub:");
				a = c.nextInt();
				b = c.nextInt();
				System.out.println(a + " - " + b + " = " + subtration(a, b));
				break;
			case 3:
				System.out.println("Enter  numbers to divide:");
				a = c.nextInt();
				b = c.nextInt();
				System.out.println(a + " / " + b + " = " + division(a, b));
				break;
			case 4:
				System.out.println("Enter  numbers to multiply:");
				a = c.nextInt();
				b = c.nextInt();
				System.out.println(a + " / " + b + " = " + multiply(a, b));
				break;
			default:
				break;
			}
		}

	}

	public static int addition(int a, int  b)
	{
		return a + b ;
		
	}

	public static int subtration(int a, int  b) {
		return a - b;

	}

	public static int division(int a, int  b) {
		return a / b;

	}
	public static int multiply(int a, int  b) {
		return a * b;

	}	
}
