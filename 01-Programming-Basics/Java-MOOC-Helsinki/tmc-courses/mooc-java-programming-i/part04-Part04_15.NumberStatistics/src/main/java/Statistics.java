import java.util.ArrayList;

public class Statistics {
    private int count;
    private int total;

    public Statistics() {
        this.count = 0;
        this.total = 0;
    }

    public void addNumber(int number) {
        this.count += 1;
        this.total += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.total;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * this.total / this.count;
    }
}
