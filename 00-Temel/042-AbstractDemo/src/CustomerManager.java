
public class CustomerManager {
	public BaseDataBaseManager baseDataBaseManager;

	public void getCustomer() {

		/*
		 * OracleDataBaseManager oracleDataBaseManager = new OracleDataBaseManager();
		 * oracleDataBaseManager.get(); bu kullanim ile oracle bagimli olmus oluyoruz
		 * bunu sql server icin yapmak istedigimizde oracle silmemiz gerekecek ve temiz
		 * kod yazmamis olacaz. Bunun yerine asagidaki gibi yapalim
		 */

		baseDataBaseManager.get();
	}
}
