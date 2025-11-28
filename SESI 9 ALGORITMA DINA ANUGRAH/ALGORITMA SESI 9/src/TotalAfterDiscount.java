public class TotalAfterDiscount {
    public static void main(String [] args) throws Exception {
        double TotalPayment = 50000;
        double money = 200000;
        double discount = 0;
    
        if (TotalPayment > 200000) {
            discount = 20;
        } else if (TotalPayment > 500000) {
            discount = 10;
        }
        double discountAmount = TotalPayment * discount / 100;
        double TotalAfterDiscount = TotalPayment-discountAmount;
        double exchange = money-TotalAfterDiscount;

        System.out.print(exchange);
            }   
}