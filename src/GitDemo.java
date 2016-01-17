import java.util.Scanner;

public class GitDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] stuff = { "Ha, ha very funny. Now what is it?", "Jokes over, just tell us.",
				"Do you want me to hurt you?", "You're just a little punk aren't ya. How newby are you?", "..." };

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

			System.out.print("What is your favorite meme? ");
			String meme = in.nextLine();

			System.out.println("Name: " + name + "; Grade: " + grade + "; Favorite water buffalo: " + waterbuffalo
					+ "; Favorite pizza: " + pizza + "; Favorite movie: " + movie + "; Favorite meme: " + meme);
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
			if (scrt == "y") {
				scrt = "are";
			} else {
				scrt = "are not";
			}
			System.out.print("Are you planning on killing anyone today? (y/n) ");
			String kill = in.nextLine();

			System.out.print("On a scale of 1 - 1000 how much newb are you? ");
			int newblvl = in.nextInt();
			in.nextLine();
			int i = 0;
			while (true) {
				if (newblvl > 1000 || newblvl < 1) {
					System.out.println(stuff[i]);
					newblvl = in.nextInt();
					in.nextLine();
				}

				else {
					break;
				}
				if (i < 5) {
					i++;
				}
			}

			System.out.println("You say you " + scrt + " part of the Illuminati"
					+ ". When we asked you if you will kill anyone you answered: " + kill
					+ ". Your newb level (that you claim) is: " + newblvl
					+ ". We know that you are a dirty little liar.");
			System.out.print("Done being interrogated? (y/n) ");
			String confirm = in.nextLine();
			if (confirm.equals("y")) {
				System.out.println("Nope. That means you're hiding something. Interrogations continue.");
			} else {
				System.out.println("Thank you for your time. But we have run out of use for you. Kill him.");
				System.out.println("You have been executed.");
				break;
			}
		}
		in.close();
	}

}
