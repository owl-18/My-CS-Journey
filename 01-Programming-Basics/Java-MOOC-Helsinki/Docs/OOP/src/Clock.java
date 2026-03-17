public class Clock {
    ClockHand hours = new ClockHand(24);
    ClockHand minutes = new ClockHand(60);
    ClockHand seconds = new ClockHand(60);

    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.minutes.advance();

            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
