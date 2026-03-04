import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        List<Integer> testArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Scanner input = new Scanner(System.in);
        System.out.println("Test Array:"+testArray);
        System.out.printf("Input element to find:");
        int element = input.nextInt();
        Boolean con = false;
        for(int item:testArray){
            if(item==element){
                System.out.println("\nItem at "+testArray.indexOf(item));
                con = true;
            }   
        }
        if(!con){
            System.out.println("Element does not exist in the list");
        }
    }
}