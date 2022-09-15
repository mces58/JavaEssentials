
public class EmailLogger extends BaseLogger {
	@Override
	public void log(String string) {
		System.out.println("Logged to email :" + string);
	}
}
