import java.util.Scanner;

public class Question {

    private int value1;
    private int value2;
    private int answer;
    String Operator;
    private Scanner input;

    public Question(int a, int b) {

        value1 = a;
        value2 = b;
    }

    public Question(int a, int b, String op) {

        value1 = a;
        value2 = b;
        Operator = op;

        // TODO: insert logic to compute the answer
        answer = a + b;
    }

    public Question() {

    }

    public void showQuestion() {


        System.out.printf("Whats is %d " + Operator + " %d?", value1, value2);


    }


    public void Question() {

        int value1;
        int value2;
        String Operator;

        value1 = 3;
        value2 = 4;


        int correct = value1 + value2;
        answer = correct;
        input = new Scanner(System.in);

        answer = Integer.parseInt(input.next());

    }

    public void checkAnswer() {

        Scanner answer = input;
        boolean correct = true;
        int count = 0;

        if (correct = true) {

            System.out.println("Wrong!! Press enter to go on.");
            input.nextLine();


        } else {

            System.out.println("Good job!!");
            count++;
            System.out.println("That was your " + count + ". correct answer. Press enter to go on!!");
            input.nextLine();

        }

        /*if (z == 11 && count == 12) {

            System.out.println("You legend! All correct!!");
        } else if (z == 11 && correct > 6) {

            System.out.println("Not too bad you have " + count + " questions correct");

        } else if (z == 11) {

            System.out.println("Oh Boy!! Just " + count + " questions correct. You better do it once more");
        }*/


    }

    public boolean checkAnswer (int fromUser){

        return false;


    }
}




