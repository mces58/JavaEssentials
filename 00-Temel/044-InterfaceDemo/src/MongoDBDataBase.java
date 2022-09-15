
public class MongoDBDataBase implements IDataBase {
	@Override
	public void add() {
		System.out.println("Mongo DB eklendi.");

	}

	@Override
	public void delete() {
		System.out.println("Mongo DB silindi.");

	}

	@Override
	public void update() {
		System.out.println("Mongo DB guncellendi.");

	}

	@Override
	public void get() {
		System.out.println("Mongo DB getirildi.");

	}
}
