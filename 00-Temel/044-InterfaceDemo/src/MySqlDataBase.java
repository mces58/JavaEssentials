
public class MySqlDataBase implements IDataBase {
	@Override
	public void add() {
		System.out.println("My sql eklendi.");

	}

	@Override
	public void delete() {
		System.out.println("My sql silindi.");

	}

	@Override
	public void update() {
		System.out.println("My sql guncellendi.");

	}

	@Override
	public void get() {
		System.out.println("My sql getirildi.");

	}
}
