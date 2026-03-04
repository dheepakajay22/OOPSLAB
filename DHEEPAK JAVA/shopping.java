import java.util.*;
public class shopping{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int count = 0;
        Map<String,Float> costMap = new HashMap<>();
        Map<String,Integer> quantityMap = new HashMap<>(); 
        mainloop:
        while (true){
            System.out.println("Welcome to bill calculator");
            System.out.println("1.To enter new item");
            System.out.println("2.Calculate Bill");
            System.out.println("3.To exit");
            System.out.printf("Enter choice:");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Enter name of item:");
                    String name = input.next();
                    System.out.printf("\nEnter cost of item:");
                    float cost = input.nextFloat();
                    System.out.printf("\nEnter quantity:");
                    int quantity = input.nextInt();
                    float total = cost* quantity;
                    costMap.put(name,cost);
                    quantityMap.put(name,quantity);
                    break;
                case 2:
                    System.out.println("Bill");
                    int total1 = 0;
                    for(String item : costMap.keySet()){
                        System.out.println("Name"+":"+item+" "+"Quantity"+":"+quantityMap.get(item).toString()+" "+"Amount:"+quantityMap.get(item)*costMap.get(item));
                        total1+=costMap.get(item);
                    }
                    System.out.printf("Total:");
                    System.out.println(total1);
                case 3:
                    break mainloop;

            }
        }
    }
}