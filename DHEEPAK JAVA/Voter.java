import java.util.Scanner;
//This program take in age of the user and prints the eligibility to vote
//Covers basics of user input,conditional statements,data types
public class Voter{
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter age: ");

        int age = userInput.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("Your are not eligible to vote");
        }
    }
}