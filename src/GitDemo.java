import java.util.Scanner;


public class GitDemo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		String name = in.nextLine();
		
		System.out.println("Hello, " + name);
		
		System.out.print("What grade are you in? ");
		int grade = in.nextInt();
		in.nextLine();
		
		System.out.println("You are in grade " + grade);
		
		System.out.print("What is your favorite water buffalo? ");
		String waterbuffalo = in.nextLine();
		
		System.out.println("Your favorite buffalo is " + waterbuffalo);
		
		System.out.print("What is your favorite type of pizza? ");
		String pizza = in.nextLine();
		
		System.out.println("Your favorite type of pizza is " + pizza);
		
		in.close();
	}

}
