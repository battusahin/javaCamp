package abstractClasses;

public class Deneme {

	private GameCalculator gameCalculator;
	
	public Deneme(GameCalculator gameCalculator) {
		this.gameCalculator = gameCalculator;
	}
	
	public void hesapla() {
		gameCalculator.hesapla();
	}
	public void gameOver() {
		gameCalculator.gameOver();
	}
}
