package selfPractice.interfaceRevision.Question12;

public class Main {
	public static void main(String[] args) {
		Game football = new FootballGame();
		Game chess = new ChessGame();
		
		football.startGame();
		chess.startGame();
	}
}
