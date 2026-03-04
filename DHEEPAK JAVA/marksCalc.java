//Inputs marks of students and tells their total percentage and status of pass or fail
import java.util.*;
public class marksCalc{
    public static void main(String[] args){
        Scanner newScanner = new Scanner(System.in);
        char choice;
        double marks,percentage;
        boolean status;
        while (true) { 
            System.out.printf("\nEnter new student:(y/n)");
            choice = newScanner.next().charAt(0);
            if(choice=='y'||choice=='Y'){
                marks = 0;
                System.out.printf("\nEnter marks of the student in Math: ");
                marks += newScanner.nextDouble();
                System.out.printf("\nEnter marks of the student in Chemistry: ");
                marks += newScanner.nextDouble();
                System.out.printf("\nEnter marks of the student in Physics: ");
                marks += newScanner.nextDouble();
                System.out.printf("\nEnter marks of the student in English: ");
                marks += newScanner.nextDouble();
                System.out.printf("\nEnter marks of the student in Computer Science: ");
                marks += newScanner.nextDouble();
                percentage = (marks/500.00)*100;
                System.out.printf("\nTotal Marks:%f",marks);
                System.out.printf("\nPercentage:%f",percentage);
                status = (percentage>50) ? true: false;
                if(status){
                    System.out.printf("\nStatus:Passed");
                }
                else{
                    System.out.printf("\nStatus:Failed");
                }
            }
            else{
                break;
            }
        }
    }
}