
public class OracleCustomerDal implements ICustomerDal {
	@Override
	public void add() {
		System.out.println("Oracle eklendi.");
	}
	// goruldugu gibi interface deki operasyonu burada override ediyoruz
	// abstruct'larda yaptigimiz gibi
}
