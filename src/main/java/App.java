import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("I will add up the numbers you give me until you enter 0\n");
        System.out.print("Number: ");

        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();

        int sum = 0;

        while (userInput != 0){

            sum += userInput;

        }

    }

}
