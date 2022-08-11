public class Square {
    private String name;

    public Square(int i) {
        this.name = "Square number: " + i;
    }

    public Square() {
        this.name = "Square number: 0";
    }

    public String getName() {
        return this.name;
    }
}
