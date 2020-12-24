public class CreditPaymentService {
    public double calculate(int amount, int month) {
        double annual_percentage = 9.99;
        double monthly_percentage = annual_percentage / 100 / 12;
        double payment = amount * (monthly_percentage + monthly_percentage / (Math.pow((1 + monthly_percentage) , month) - 1));
        return payment;
    }
}
