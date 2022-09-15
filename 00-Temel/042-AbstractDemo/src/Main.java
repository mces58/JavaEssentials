
public class Main {
	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		/*
		 * customerManager.getCustomer();
		 * 
		 * bu kullanim hata verdiriyor cunku BaseDataBaseManager icinde ki getCustomer
		 * fonk. ici bos . Dolayisiyla boyle yazilamaz
		 */

		customerManager.baseDataBaseManager = new OracleDataBaseManager();
		customerManager.baseDataBaseManager.get();

		customerManager.baseDataBaseManager = new SqlServerDataBaseManager();
		customerManager.baseDataBaseManager.get();

		/*
		 * sifir bagimlilik yeni bir data base eklendiginde onun imzasini yazmak yeterli
		 */

		System.out.println();

		// diziye attik hepsini
		BaseDataBaseManager baseManagers[] = new BaseDataBaseManager[] { new OracleDataBaseManager(),
				new SqlServerDataBaseManager() };

		for (BaseDataBaseManager baseManager : baseManagers) {
			baseManager.get();
		}
	}
}
