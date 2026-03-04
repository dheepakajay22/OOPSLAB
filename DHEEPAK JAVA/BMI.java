import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter your height in m: ");
        double height = newScanner.nextDouble();
        System.out.println("\n");
        System.out.print("Enter you weight in kg: ");
        double weight =  newScanner.nextDouble();
        System.out.println("\n");
        double bmi = Math.floor(weight/Math.pow(height,2));
        System.out.printf("BMI:%.3f\n",bmi);
        if((bmi<24.9) &&(bmi>18.5)){
            System.out.println("Your BMI is good");
        }
        else{
            System.out.println("Your BMI is bad");
        }


    }
}