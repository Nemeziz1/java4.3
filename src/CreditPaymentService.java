public class CreditPaymentService {
    public double calculate (double credit, double percent, double time) {
        double payment = credit * ((percent) * (Math.pow((percent + 1), time)))/ (Math.pow((percent + 1), time) - 1);
        return payment;
    }
}
