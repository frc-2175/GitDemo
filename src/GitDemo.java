import java.util.Scanner;


public class GitDemo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
		
			System.out.print("What's your name? ");
			String name = in.nextLine();
			
			System.out.print("What grade are you in? ");
			int grade = in.nextInt();
			in.nextLine();
			
			System.out.print("What is your favorite water buffalo? ");
			String waterbuffalo = in.nextLine();
			
			System.out.print("What is your favorite type of pizza? ");
			String pizza = in.nextLine();
	
			System.out.print("What is your favorite movie? ");
			String movie = in.nextLine();
			
			System.out.println("Name: " + name + " Grade: " + grade + " Favorite water buffalo: " + waterbuffalo + " Favorite pizza: " + pizza + " Favorite movie: " + movie);
			System.out.print("Is this correct? (y/n) ");
			String confirm = in.nextLine();
			if (confirm.equals("y")) {
				break;
			}
			
		}
		
		System.out.println("Thank you for your time!");
		
		in.close();
	}

}
