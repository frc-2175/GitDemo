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
		
		while (true) {
			System.out.print("Are you part of the Illuminati? (y/n) ");
			String scrt = in.nextLine();
			
			System.out.print("Are you planning on killing anyone today? (y/n) ");
			String kill = in.nextLine();
			
			System.out.print("On a scale of 1 - 1000 how much newb are you? ");
			int newblvl = in.nextInt();
			in.nextLine();
			while (true) {
				if (newblvl > 1000 || newblvl < 1) {
					System.out.println("Ha, ha very funny. Now what is it?");
					newblvl = in.nextInt();
					in.nextLine();
				}
				else {
					break;
				}
			}
			
			System.out.println("You claim that your allegiance to the Illuminati is " + scrt + ". When we asked you if you will kill anyone you answered: " + kill + ". Your newb level (that you claim) is:" + newblvl + ". We know that you are a dirty little liar.");
			System.out.print("Done being interrogated? (y/n) ");
			String confirm = in.nextLine();
			if (confirm.equals("y")) {
				System.out.println("Nope. That means you're hiding something. Interrogations continue.");
			}
			else {
				System.out.println("Thank you for your time. But we have run out of use for you. Kill him.");
				System.out.println("You have been executed.");
				break;
			}
		}
		in.close();
	}

}
