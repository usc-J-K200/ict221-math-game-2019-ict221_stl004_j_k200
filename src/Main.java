import java.util.Random;
import java.util.Scanner;

/**
 * This is a simple math game for grades 3-5.
 *
 * @author Your Name
 */

public class Main {
    /**
     * Runs the quiz
     *
     */
    static class Question {
        int val1;
        int val2;

        public Question (int a, int b) {
            val1=a;
            val2=b;

        }

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            Random rand = new Random(1);

            /**
             * "Seed" makes every round the same. I generates semi rendomness
             */


            int z = 0;
            int count = 0;


            while (z <= 13) {
                z++;


                int a = 1 + rand.nextInt(11);
                int b = 1 + rand.nextInt(11);
                Question q = new Question(a, b);
                q.ask();
                int correct = a + b;
                int response;
                input = new Scanner(System.in);

                System.out.printf("Whats is %d + %d?", val1, val2);

                response = Integer.parseInt(input.next());

                if (correct == response) {

                    System.out.println("Good job!!");
                    count++;
                    System.out.println("That was your " + count + ". correct answer. Press enter to go on!!");
                    input.nextLine();

                } else {

                    System.out.println("Wrong!! Press enter to go on.");
                    input.nextLine();


                }

                if (z == 11 && count == 12) {

                    System.out.println("You legend! All correct!!");
                } else if (z == 11 && correct > 6) {

                    System.out.println("Not too bad you have " + count + " questions correct");

                } else if (z == 11) {

                    System.out.println("Oh Boy!! Just " + count + " questions correct. You better do it once more");
                }


            }
        }

        private void ask() {

        }
    }

}
