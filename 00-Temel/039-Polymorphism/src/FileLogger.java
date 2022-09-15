
public class FileLogger extends BaseLogger {
	@Override
	public void log(String string) {
		System.out.println("Logged to file : " + string);
	}
}
