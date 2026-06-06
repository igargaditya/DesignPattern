package Strategy;

class User {
    private String name;
    private Integer age;
    private PaymentStrategy strategy;

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void payBill(int amount, PaymentStrategy strategy) {
        strategy.payment(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        User user1 = new User("Aditya", 23);
        user1.payBill(1000, new UpiPay());
        user1.payBill(299, new DebitCard());
        user1.payBill(970, new NetBanking());
    }
}