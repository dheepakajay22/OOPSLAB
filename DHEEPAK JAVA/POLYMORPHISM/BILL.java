class InvoiceProcessor {
    public void invoice(String customerName, double amount) {
        double finalAmount = calculateAmount(amount); 
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: " + finalAmount);
    }
    private double calculateAmount(double amount) {
        System.out.println("(Internal Calculation: No discount applied)");
        return amount;
    }
}
class RetailInvoice extends InvoiceProcessor {
    @Override
    public void invoice(String customerName, double amount) {
        double discount = amount * 0.1; 
        double finalAmount = amount - discount;
        System.out.println("Customer: " + customerName);
        System.out.println("Original Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}
public class BILL{
    public static void main(String[] args) {
        InvoiceProcessor obj;
        obj = new RetailInvoice(); 
        obj.invoice("ajay", 1000);
    }
}