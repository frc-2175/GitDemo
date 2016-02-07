import java.util.Scanner;

public class GitDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] stuff = { "Ha, ha very funny. Now what is it?",
                "Jokes over, just tell us.", "Do you want me to hurt you?",
                "You're just a little punk aren't ya. How newby are you?",
                "..." };

        while (true) {

            String[] questions = { "name", "grade", "favorite water buffalo",
                    "favorite type of pizza", "favorite movie",
                    "favorite meme" };
            String[] answers = new String[6];

            for (int i = 0; i < 6; i++) {

                System.out.println("What is your " + questions[i] + "? ");
                answers[i] = in.nextLine();

            }
            for (int i = 0; i < 6; i++) {
                System.out.print(questions[i] + ": " + answers[i] + "; ");
            }
            System.out.print("\nIs this correct? (y/n) ");
            String confirm = in.nextLine();
            if (confirm.equals("y")) {
                break;
            }

        }

        System.out.println("Thank you for your time!");
        System.out.println("...Just kidding. We're just getting started.");

        while (true) {
            System.out.print("Are you part of the Illuminati? (y/n) ");
            String illuminati = in.nextLine();
            if (illuminati.equals("y")) {
                illuminati = "are";
            } else {
                illuminati = "are not";
            }

            System.out
                    .print("Are you planning on killing anyone today? (y/n) ");
            String kill = in.nextLine();
            if (kill.equals("y")) {
                kill = "are";
            } else {
                kill = "are not";
            }

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
                if (i < 4) {
                    i++;
                }
            }

            System.out.println("You claim that you " + illuminati
                    + " a part the Illuminati. You say that you " + kill
                    + " planning to kill someone today. Your newb level (that you claim) is: "
                    + newblvl + ". We know that you are a dirty little liar.");
            System.out.print("Done being interrogated? (y/n) ");
            String confirm = in.nextLine();
            if (confirm.equals("y")) {
                System.out.println(
                        "Nope. That means you're hiding something. Interrogations continue.");
            } else {
                System.out.println(
                        "Thank you for your time. But we have run out of use for you. Kill him.");
                System.out.println("You have been executed.");
                break;
            }
        }
        in.close();
    }

}
