package castle;

public class HandlerHelp extends Handler {

	public HandlerHelp(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCmd(String word) {
		System.out.print("迷路了吗？你可以做的命令有：go bye help");
		System.out.println("如：\tgo east");
	}
}