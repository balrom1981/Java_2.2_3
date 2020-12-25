public class CreditPaymentService {
    public double calculate(int amount, int month) {
        double annualPercentage = 9.99;
//        Расчет аннуитетного платежа
        double monthlyPercentage = annualPercentage / 100 / 12;
        double payment = amount * (monthlyPercentage + monthlyPercentage / (Math.pow((1 + monthlyPercentage) , month) - 1));
        return payment;
    }
}
