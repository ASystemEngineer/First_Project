import java.sql.ResultSet;
import java.util.Scanner;

public class First_Project {
    static public void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");
        int range = 100;
        int number = (int)(Math.random() * range);
        while (true){
            System.out.println("Guess the number from 1 to " + range);
            int input_number = scanner.nextInt();
            if(input_number == number) {
                System.out.println("You guessed right, bro!");
                break;
            }else if (input_number > number) {
                System.out.println("I didn't expect from you. The guessed number is less, bro");
            }else {
                System.out.println("I'm shocked myself, but, the guessed number is bigger, bro");
            }
        }
        scanner.close();
    }
}
