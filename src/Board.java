public class Board {
    private Square[] squares;

    public Board() {
        this.squares = new Square[40];
    }

    public Square getSquare(Square oldLocation,int faceValueTotal) {
        for(int i = 0; i < 40; i++) {
            if(this.squares[i].getName() == oldLocation.getName()) {
                return this.squares[(i+faceValueTotal) % 40];
            }
        }
        return null;
    }
}
