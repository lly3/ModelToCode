public class Piece {
    private Square location;

    public Square getLocation() {
        return this.location;
    }

    public void setLocation(Square location) {
        if(location != null)
            this.location = location;
    }
}
