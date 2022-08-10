public class MGame {
    private int roundCount;
    private static final int N = 262;
    private Die[] dice;
    private Board board;

    private Player[] players;

    public MGame() {
        this.dice = new Die[2];
        this.board = new Board();
        this.players = new Player[8];
    }

    public void playGame() {
        while(this.roundCount < N) {
            this.playRound();
            ++this.roundCount;
        }
    }

    private void playRound() {
        for (Player player: this.players) {
            player.takeTurn();
        }
    }
}
