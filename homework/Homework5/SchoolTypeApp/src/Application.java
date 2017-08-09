import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("What grade are you in?");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if ((x > 0) && (x <= 5)) {
			System.out.println("Elementary School");

		} else if ((x > 5) && (x < 9)) {
			System.out.println("Middle School");

		} else if ((x > 8) && (x < 13)) {
			System.out.println("High School");

		} else if (x > 12) {
			System.out.println("College");
		}
		else {
			System.out.println("Please enter Valid Number Greater than Zero ");
		}
	}

}
