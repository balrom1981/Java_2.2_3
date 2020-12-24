public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment_one = service.calculate(1_000_000, 12);
        System.out.println(payment_one);
        double payment_two = service.calculate(1_000_000, 24);
        System.out.println(payment_two);
        double payment_three = service.calculate(1_000_000, 36);
        System.out.println(payment_three);
    }
}
