
public class RockPaperScissorsGui2 {
	private static final int WIDTH = 700;
	private static final int HEIGHT = 500;
	private static final int X_COORDINATE = 700;
	private static final int Y_COORDINATE = 700;
	public static void main(String[] args) {
		RockPaperScissors rp = new RockPaperScissors();
		rp.setBounds(X_COORDINATE,Y_COORDINATE,WIDTH,HEIGHT);
		rp.setVisible(true);
		

	}

}
