public class Counter {
  int startValue;

  public Counter(int startValue) {
    this.startValue = startValue;
  }

  public Counter() {
    this.startValue = 0;
  }

  public int value() {
    return this.startValue;
  }

  public void increase() {
    if (this.startValue < 0) {
      return;
    }
    ++this.startValue;
  }

  public void decrease() {
    if (this.startValue < 0) {
      return;
    }
    --this.startValue;
  }

  public void increase(int increaseBy) {
    if (increaseBy < 0) {
      return;
    }
    this.startValue = this.startValue + increaseBy;
  }

  public void decrease(int decreaseBy) {
    if (this.startValue < 0 || decreaseBy < 0) {
      return;
    }
    this.startValue = this.startValue - decreaseBy;
  }
}
