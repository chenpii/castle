package castle;

public class Handler {
	protected Game game;

	public Handler(Game game) {
		super();
		this.game = game;
	}

	public void doCmd(String word) {

	}

	public boolean isBye() {
		return false;
	}
}
