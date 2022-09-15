
public class DataBaseLogger extends BaseLogger {

	@Override
	public void log(String string) {
		System.out.println("Logged to data base : " + string);
	}
}
