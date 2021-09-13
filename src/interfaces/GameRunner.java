package interfaces;

public class GameRunner {

	public static void main(String[] args) {
		
		GamingConsole[] games = {new MarioGame(), new ChessGame()};
		
		//MarioGame game = new MarioGame();
		//ChessGame game = new ChessGame();
		//GamingConsole game = new MarioGame();
		
		for(GamingConsole game: games) { // Polymorphism
			game.up();
			game.down();
			game.left();
			game.right();
		}
		
	}

}
