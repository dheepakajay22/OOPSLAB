import java.util.*;
//Loop Programs
public class iteration{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Factorial Program
        System.out.printf("Enter a number for factorial:");
        int n = input.nextInt();
        int result = 1;
        for(int i=1;i<=n;i++) {
            result *= i;
        }
        System.out.printf("\n Result is:%d",result);
        //Multiplication Table
        System.out.printf("\n Enter a number for multiplication table:");
        int num = input.nextInt();
        int i = 1;
        do{
            System.out.printf("\n %d * %d = %d",num,i,num*i);
            i++;
        }while(i<11);
        //Number Guessing Game
        int num1;
        Random rand = new Random();
        int random;
        while(true){
            System.out.printf("\n Guess a number to escape from 1 to 10: ");
            num1 = input.nextInt();
            random  = rand.nextInt(10)+1;
            if(num1!=random){
                System.out.println("You lost,try again");
            }
            else{
                System.out.println("You guessed it");
                break;
            }

        }
        //Program to print a input string without vowels
        System.out.printf("\nEnter a string:");
        String line = input.next();
        int len  = line.length();
        String vowels = "aeiouAEIOU";
        String output = "";
        for(int j = 0;j<len;j++){
            if(vowels.indexOf(line.charAt(j))==-1){
                output+=line.charAt(j);
            }
            else{
                continue;
            }   
        }
        System.out.printf("Updated String:%s",output);

    }

}
