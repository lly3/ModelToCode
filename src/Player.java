public class Player {
    private String name;
    private int faceValueTotal;
    private Board board;
    private Die[] dice;
    private Piece piece;

    public Player() {
        this.dice = new Die[2];
        this.board = new Board();
        this.piece = new Piece();
        this.faceValueTotal = 0;
    }

    public void takeTurn() {
        for(Die die: dice) {
            die.roll();
            faceValueTotal += die.getFaceValue();
        }

        Square oldLocation = this.piece.getLocation();
        Square newLocation = this.board.getSquare(oldLocation, faceValueTotal);
        this.piece.setLocation(newLocation);
    }
}
