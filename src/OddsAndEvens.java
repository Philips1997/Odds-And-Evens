import java.util.*;
public class OddsAndEvens {
    public static void main (String[] args) {
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String choice = input.next();
        if (choice.equals("E")) {
            System.out.println(name +" has picked evens! The computer will be odds.");
        } else {
            System.out.println(name +" has picked odds! The computer will be evens.");
        }
        System.out.println("--------------------------");

        System.out.println("How many \"fingers\" do you put out? ");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);
        System.out.println("The computer plays " + computerNumber + " \"fingers\". ");
        System.out.println("--------------------------");

        int sumNumber = userNumber + computerNumber;
        System.out.println(userNumber + " + " + computerNumber + " = " + sumNumber);
        if (sumNumber % 2 == 0){
            if (choice.equals("E")){
                System.out.println(sumNumber + " is ... even.");
                System.out.println("That means " + name +" wins!");
            } else {
                System.out.println(sumNumber + " is ... even.");
                System.out.println("That means computer wins!");
            }
        } else {
            if (choice.equals("O")){
                System.out.println(sumNumber + " is ... odd.");
                System.out.println("That means " + name +" wins!");
            } else {
                System.out.println(sumNumber + " is ... odd.");
                System.out.println("That means computer wins!");
            }
        }
    }
}
