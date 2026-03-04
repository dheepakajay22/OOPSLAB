import java.util.*;

public class Ticketbook{
    public static void main(String args[]){
        int testCase = 1;
        Scanner input = new Scanner(System.in);
        List<String> tickets = new ArrayList<>();
        Map<String,List<String>> waitListMap = new HashMap<>();
        Map<String,Map<String,String>> userMap = new HashMap<>();
        Map<String,String> userStatus = new HashMap<>();
        for(int i = 1;i<=testCase;i++){
            tickets.add("GEN:"+Integer.toString(i));
            waitListMap.put("GEN:"+Integer.toString(i),new ArrayList<>());
        }
        for(int i=1;i<=testCase;i++){
            tickets.add("H:"+Integer.toString(i));
            waitListMap.put("H:"+Integer.toString(i),new ArrayList<>());
        }
        for(int j=1;j<=2;j++){
            for(int i=1;i<=testCase;i++){
                tickets.add("A-"+Integer.toString(j)+":"+Integer.toString(i));
                waitListMap.put("A-"+Integer.toString(j)+":"+Integer.toString(i),new ArrayList<>());
            }
        }
        for(int j=1;j<=3;j++){
            for(int i=1;i<=testCase;i++){
                tickets.add("B-"+Integer.toString(j)+":"+Integer.toString(i));
                waitListMap.put("B-"+Integer.toString(j)+":"+Integer.toString(i),new ArrayList<>());
            }
        }
        for(int j=1;j<=7;j++){
            for(int i=1;i<=testCase;i++){
                tickets.add("S-"+Integer.toString(j)+":"+Integer.toString(i));
                waitListMap.put("S-"+Integer.toString(j)+":"+Integer.toString(i),new ArrayList<>());
            }
        }
        List<String> waitlistTickets = new ArrayList<>(tickets);
        mainLoop:
        while(true){
           
            if(tickets.size()>0){
                System.out.println("Welcome to Ticket-Booking System");
                System.out.println("1.View Available Tickets");
                System.out.println("2.Book Tickets");
                System.out.println("3.Cancel Tickets");
                System.out.println("4.Check Status");
                System.out.println("5.Exit");
                System.out.printf("Enter choice:");
                int choice = input.nextInt();
                switch(choice){
                    case 1:
                        for(String ticket:tickets){
                            System.out.println(ticket);
                        }
                        break;
                    case 2:
                        System.out.printf("Enter username: ");
                        String user = input.next();
                        System.out.printf("\nEnter no. of tickets:");
                        int number = input.nextInt();
                        List<String> localTickets = new ArrayList<>();
                        Map<String,String> tempMap = new HashMap<>();
                        String localTicket;
                        if(number<=tickets.size()){
                            userMap.put(user,new HashMap<>());
                            for(int i =1;i<=number;i++){
                                inputLoop:
                                while(true){
                                    System.out.printf("\nEnter ticket no"+Integer.toString(i)+":");
                                    localTicket = input.next();
                                    if(tickets.contains(localTicket)){
                                        localTickets.add(localTicket);
                                        tickets.remove(localTicket);
                                        break;

                                    }
                                    else{
                                        System.out.println("\nTry Again");
                                    }
                                }
                            }
                        }
                        else{
                            System.out.println("Request exceeds no. of tickets");
                            break;
                        }
                        for(String obj:localTickets){
                                    tempMap.put(obj,"confirmed");
                                }
                        userMap.put(user,tempMap);
                        userStatus.put(user,"confirmed");
                        System.out.println("\nTickets booked successfully");
                        break;
                    case 3:
                        System.out.printf("\nEnter username:");
                        String name = input.next();
                        if(!userMap.keySet().contains(name)){
                            System.out.println("\nNo booking with that name");
                            break;
                        }
                        else{
                            System.out.println("\nTickets:");
                            for(String ticket: userMap.get(name).keySet()){
                                System.out.println("\n"+ticket);
                            }
                            System.out.printf("Are you sure:");
                            String in = input.next();
                            if(in.contains("yes")){
                                for(String ticket:userMap.get(name).keySet()){
                                    tickets.add(ticket);
                                }
                                userMap.remove(name);
                                userStatus.remove(name);
                                System.out.println("Cancellation successful");
                            }
                            else{
                                System.out.println("\nCancellation not proceeded");
                            }

                        }
                        break;
                    case 4:
                        System.out.printf("\nEnter username:");
                        String username = input.next();
                        if(userStatus.keySet().contains(username)){
                            for(String obj:userMap.get(username).keySet()){
                                System.out.println("\n"+obj+":"+userMap.get(username).get(obj));
                            }
                            break;
                        }
                        else{
                            System.out.println("No booking found for the user");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting System");
                        break mainLoop;
                    default:
                        System.out.println("Invalid Choice.Try Again:");
                        break;
                }
            }
           
           else{
                System.out.println("Entered Waitlist stage");
                System.out.println("Welcome to Ticket-Booking System");
                System.out.println("1.View Available Tickets");
                System.out.println("2.Book Tickets");
                System.out.println("3.Cancel Tickets");
                System.out.println("4.Check Status");
                System.out.println("5.Exit");
                System.out.printf("Enter choice:");
                int choice = input.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("\nTickets:");
                        for(String ticket:waitlistTickets){
                            System.out.println(ticket);
                        }
                    case 2:
                        System.out.printf("Enter username: ");
                        String user = input.next();
                        System.out.printf("\nEnter no. of tickets:");
                        int number = input.nextInt();
                        List<String> localTickets = new ArrayList<>();
                        Map<String,String> tempMap = new HashMap<>();
                        String localTicket;
                        if(waitlistTickets.size()<=number){
                            userMap.put(user,new HashMap<>());
                            for(int i =1;i<=number;i++){
                                inputLoop:
                                while(true){
                                    System.out.printf("\nEnter ticket no"+Integer.toString(i)+":");
                                    localTicket = input.next();
                                    if(waitlistTickets.contains(localTicket)){
                                        localTickets.add(localTicket);
                                        tickets.remove(localTicket);
                                        waitListMap.get(localTicket).add(user);
                                        break;

                                    }
                                    else{
                                        System.out.println("\nTry Again");
                                    }
                                }
                            }
                        }
                        else{
                            System.out.println("Request exceeds no. of tickets");
                            break;
                        }
                        for(String obj:localTickets){
                                    tempMap.put(obj,"waitlisted");
                                }
                        userMap.put(user,tempMap);
                        userStatus.put(user,"waitlisted");
                        System.out.println("\nTickets booked successfully");
                        break;
                    case 3:
                        System.out.printf("Enter your username:");
                        String username = input.next();
                        System.out.println("\nYour tickets:");
                        for(String ticket:userMap.get(username).keySet()){
                            System.out.println(ticket+":"+userMap.get(username).get(ticket));
                        }
                        System.out.printf("Are you sure:");
                        String opt = input.next();
                        if(opt.contains("yes")){
                            for(String ticket:userMap.get(username).keySet()){
                                if(userMap.get(username).get(ticket).contains("confirmed")){
                                    if(waitListMap.get(ticket).size()>0){
                                        String help = waitListMap.get(ticket).get(0);
                                        waitListMap.get(ticket).remove(0);
                                        userMap.get(help).put(ticket,"confirmed");
                                    }
                                    else{
                                        tickets.add(ticket);
                                    }
                                }
                                else{
                                    waitListMap.get(ticket).remove(username);
                                }
                            }
                            userMap.remove(username);
                            userStatus.remove(username);
                            break;
                        }
                        else{
                            System.out.println("Cancellation halted");
                            break;
                        }
                    case 4:
                        System.out.printf("Enter your username: ");
                        String name = input.next();
                        if(userMap.keySet().contains(name)){
                            for(String ticket:userMap.get(name).keySet()){
                                System.out.println(ticket+":"+userMap.get(name).get(ticket));
                            }
                            break;
                        }else{
                            System.out.println("No such user found in bookings");
                            break;
                        }

                    default:
                        System.out.println("\nEntered invalid choice");
                        break;

                }
           }

           
        }
    }
}