
public class MySqlCustomerDal implements ICustomerDal {
	@Override
	public void add() {
		System.out.println("My sql eklendi.");
	}
	// goruldugu gibi interface deki operasyonu burada override ediyoruz
	// abstruct'larda yaptigimiz gibi
}
