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
		
		System.out.print("Why is life horrible? ");
		String color = in.nextLine();
		
		System.out.println("Your favorite color is " + color);
		
		in.close();
	}

}
