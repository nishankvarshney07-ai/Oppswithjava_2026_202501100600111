abstract class Payment{
     abstract void pay(double amount);

} 
class CreditCardPayment extends Payment{
    @Override 
     void pay (double amount){
        System.out.println("payment of" + amount);
    }
}
class UPIPayment extends Payment{
    @Override 
    void pay(double amount){
        System.out.println("paymen" + amount + "upi");
    }
}
public class PaymentTest {
public static void main(String[] args) {
Payment p1 = new CreditCardPayment();
Payment p2 = new UPIPayment();
p1.pay(5000);
p2.pay(2500);
}
}










