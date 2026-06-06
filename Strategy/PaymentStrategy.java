package Strategy;

interface PaymentStrategy {
    void payment(int amount);
}

class UpiPay implements PaymentStrategy {
    public void payment(int amount) {
        System.out.println("Paying Amount: " + amount + " via UPI");
    }
}

class DebitCard implements PaymentStrategy {
    public void payment(int amount) {
        System.out.println("Paying Amount: " + amount + " via DebitCard");
    }
}

class NetBanking implements PaymentStrategy {
    public void payment(int amount) {
        System.out.println("Paying Amount: " + amount + " via NetBanking");
    }
}