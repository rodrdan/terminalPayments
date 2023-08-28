
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.affordableMeals++;
            this.money += 2.50;
            return payment - 2.50;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            affordableMeals++;
            card.takeMoney(2.50);
            return true;
        }
        return false;
    }
    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            heartyMeals++;
            card.takeMoney(4.30);
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.heartyMeals++;
            this.money += 4.30;
            return payment - 4.30;
        }
        return payment;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }




    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
