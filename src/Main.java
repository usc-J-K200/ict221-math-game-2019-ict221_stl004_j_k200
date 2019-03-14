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
    private Scanner input = new Scanner(System.in);
    private Random rand = new Random(1);// "Seed" makes every round the same. I generates semi rendomness


        public static void main(String[] args) {

            Main game = new Main();
            game.play();


        }

        public void play (){



            int value1 = 1 + rand.nextInt(11);
            int value2 = 1 + rand.nextInt(11);

            String operator = "+";

            Question q1 = new Question(value1, value2, operator);
            q1.showQuestion();



            }
        }



