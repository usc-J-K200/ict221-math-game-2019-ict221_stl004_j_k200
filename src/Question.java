import java.util.Random;
import java.util.Scanner;

public class Question {

    private int value1;
    private int value2;
    private int answer;
    String Operator;

    public Question(int a, int b) {

        value1 = a;
        value2 = b;
    }

    public Question(int a, int b, String op){

        value1 = a;
        value2 = b;
        Operator = op;

        // TODO: insert logic to compute the answer
        answer = a + b;
    }

    public void showQuestion() {



        System.out.printf("Whats is %d " + Operator + " %d?", value1, value2);


    }


    public void Question() {

        int value1;
        int value2;
        String Operator;
        answer = correct();

        value1 = 3;
        value2 = 4;


        int correct = value1 + value2;
        input = new Scanner(System.in);

        answer = Integer.parseInt(input.next());

    }

        public void checkAnswer() {

        int answer;
        boolean correct;

            if (correct == answer) {

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

