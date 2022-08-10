public class Die {
    private int faceValue;

    public void roll() {
        this.faceValue = (int)Math.random()*(5) + 1;
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}
