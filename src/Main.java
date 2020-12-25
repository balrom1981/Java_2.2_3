public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double paymentOne = service.calculate(1_000_000, 12);
        System.out.println(paymentOne);
        double paymentTwo = service.calculate(1_000_000, 24);
        System.out.println(paymentTwo);
        double paymentThree = service.calculate(1_000_000, 36);
        System.out.println(paymentThree);
    }
}
