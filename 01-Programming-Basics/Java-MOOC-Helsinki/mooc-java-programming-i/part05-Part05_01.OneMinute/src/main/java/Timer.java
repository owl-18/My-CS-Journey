public class Timer {
    private ClockHand minutes;
    private ClockHand seconds;
    private ClockHand hundredthsOfASecond;

    public Timer() {
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
        this.hundredthsOfASecond = new ClockHand(100);
    }

    public void advance() {
        this.hundredthsOfASecond.advance();

        if (this.hundredthsOfASecond.value() == 0) {
            this.seconds.advance();
            if (this.seconds.value() == 0) {
                this.minutes.advance();
            }
        }
    }

    @Override
    public String toString() {
        return seconds + ":" + hundredthsOfASecond;
    }
}
