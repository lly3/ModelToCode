public class Board {
    private Square[] squares;

    public Board() {
        this.squares = new Square[40];
        for(int i = 0; i < squares.length; i++) {
            squares[i] = new Square(i);
        }
    }

    public Square getSquare(Square oldLocation,int faceValueTotal) {
        for(int i = 0; i < this.squares.length; i++) {
            if(this.squares[i].getName() == oldLocation.getName()) {
                return this.squares[(i+faceValueTotal) % 40];
            }
        }
        return null;
    }
}
