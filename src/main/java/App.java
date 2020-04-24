import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("I will add up the numbers you give me until you enter 0");
        System.out.print("Number: ");

        Scanner scan = new Scanner(System.in);

        int userInput = 0;
        userInput = scan.nextInt();

        int sum = 0;
        sum += userInput;

        System.out.println("The total so far is "+sum);

        while (userInput != 0){
            userInput = scan.nextInt();
            sum += userInput;

        }
        System.out.println(sum);
    }

}
