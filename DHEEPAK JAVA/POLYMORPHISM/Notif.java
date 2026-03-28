class Notifier {
   public void send(String message) {
	System.out.println("General Notification: " + message);
	logNotification(message); 
   }
   protected void send(String message, String email) {
	System.out.println("Email Notification:");
	System.out.println("Message: " + message);
	System.out.println("Sent to Email: " + email);
   }
   void send(String message, long phoneNumber){
	System.out.println("SMS Notification:");
	System.out.println("Message: " + message);
	System.out.println("Sent to Phone: " + phoneNumber);
   }
   private void logNotification(String message) {
	System.out.println("(Log: Notification stored internally -> " + message + ")");
   }
}
class AppNotifier extends Notifier {
   public void useNotifications() {
	send("Welcome User!"); 
	send("Check your email!", "user@gmail.com"); 
	send("OTP is 1234", 9876543210L);
   }
}
public class Notif {
   public static void main(String[] args) {
	AppNotifier app = new AppNotifier();
	app.useNotifications();
   }
}