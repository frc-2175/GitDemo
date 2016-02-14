import java.util.Scanner;

public class GitDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] newbStatements = { "Ha, ha very funny. Now what is it?",
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

        System.out.println(
                "Thank you for your time! \n...Just kidding. We're just getting started.");

        while (true) {

            String[] questions = { "Are you a part of the Illuminati? (y/n) ",
                    "Are you planning on killing anyone today? (y/n) ",
                    "On a scale of 1 - 1000 how much newb are you? " };
            String[] answers = new String[3];
            for (int i = 0; i < 3; i++) {
                System.out.println(questions[i]);
                answers[i] = in.nextLine();
                if (i == 0 && answers[0].equals("y")) {
                    answers[i] = "Involved";
                }
                if (i == 1 && answers[1].equals("y")) {
                    answers[i] = "Yes";
                }
                if (i == 2) {
                    int j = 0;
                    while (true) {
                        if (Integer.parseInt(answers[i]) >= 1
                                && Integer.parseInt(answers[i]) <= 1000) {
                            break;
                        } else {
                            System.out.println(newbStatements[j]);
                            // System.out.println(Integer.parseInt(answers[i]));
                            answers[i] = in.nextLine();

                        }
                        if (j < 4) {
                            j++;
                        } else {
                            j -= 4;
                        }
                    }
                }

            }

            System.out.println("Alignment with Illuminati: " + answers[0]
                    + ". Involved in any gangsta business: " + answers[1]
                    + ". Your newb level (that you claim) is: " + answers[2]
                    + ". We know that you are a dirty little liar.");
            System.out.print("Done being interrogated? (y/n) ");
            String confirm = in.nextLine();
            if (confirm.equals("y")) {
                System.out.println(
                        "Nope. That means you're hiding something. Interrogations continue.");
            } else {
                System.out.println(
                        "Thank you for your time. But we have run out of use for you. Kill him.");
                System.out.println("You have been EXECUTED.");
                break;
            }
        }
        in.close();
    }

}
