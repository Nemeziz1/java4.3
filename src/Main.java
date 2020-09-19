public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 0.008325, 12);
        int pay = (int)Math.round(payment);
        System.out.println(pay);

        double payment1 = service.calculate(1_000_000, 0.008325, 24);
        int pay1 = (int)Math.round(payment1);
        System.out.println(pay1);

        double payment2 = service.calculate(1_000_000, 0.008325, 36);
        int pay2 = (int)Math.round(payment2);
        System.out.println(pay2);
    }
}
