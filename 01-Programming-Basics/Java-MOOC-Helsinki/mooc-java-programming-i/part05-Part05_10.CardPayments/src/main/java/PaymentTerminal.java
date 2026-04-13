public class PaymentTerminal {

  private double money; // amount of cash
  private int affordableMeals; // number of sold affordable meals
  private int heartyMeals; // number of sold hearty meals

  public PaymentTerminal() {
    // register initially has 1000 euros of money
    this.money = 1000;
    this.affordableMeals = 0;
    this.heartyMeals = 0;
  }

  public void addMoneyToCard(PaymentCard card, double sum) {
    if (sum > 0) {
      card.addMoney(sum);
      this.money += sum;
    }
  }

  public double eatAffordably(double payment) {
    // an affordable meal costs 2.50 euros
    // increase the amount of cash by the price of an affordable mean and return the change
    // if the payment parameter is not large enough, no meal is sold and the method should return
    // the whole payment
    double costAffordably = 2.50;
    if (payment >= costAffordably) {
      ++affordableMeals;
      payment -= costAffordably;
      this.money += costAffordably;
      return payment;
    }
    return payment;
  }

  public boolean eatAffordably(PaymentCard card) {
    double costAffordably = 2.50;
    if (card.takeMoney(costAffordably)) {
      ++affordableMeals;
      return true;
    }
    return false;
  }

  public double eatHeartily(double payment) {
    // a hearty meal costs 4.30 euros
    // increase the amount of cash by the price of a hearty mean and return the change
    // if the payment parameter is not large enough, no meal is sold and the method should return
    // the whole payment
    double costHeartily = 4.30;
    if (payment >= costHeartily) {
      ++heartyMeals;
      payment -= costHeartily;
      this.money += costHeartily;
      return payment;
    }
    return payment;
  }

  public boolean eatHeartily(PaymentCard card) {
    // a hearty meal costs 4.30 euros
    // increase the amount of cash by the price of a hearty mean and return the change
    // if the payment parameter is not large enough, no meal is sold and the method should return
    // the whole payment
    double costHeartily = 4.30;
    if (card.takeMoney(costHeartily)) {
      ++heartyMeals;
      return true;
    }
    return false;
  }

  public String toString() {
    return "money: "
        + money
        + ", number of sold affordable meals: "
        + affordableMeals
        + ", number of sold hearty meals: "
        + heartyMeals;
  }
}
