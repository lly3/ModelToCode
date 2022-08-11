public class Player {
    private String name;
    private Board board;
    private Die[] dice;
    private Piece piece;

    public Player(Board board, Die[] dice) {
        this.board = board;
        this.dice = dice;
        this.piece = new Piece();
    }

    public void takeTurn() {
        int faceValueTotal = 0;
        for(Die die: dice) {
            die.roll();
            faceValueTotal += die.getFaceValue();
        }

        Square oldLocation = this.piece.getLocation();
        Square newLocation = this.board.getSquare(oldLocation, faceValueTotal);
        this.piece.setLocation(newLocation);
    }
}
