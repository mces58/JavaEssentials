
public class Main {
	public static void main(String[] args) {
		/*
		 * ICustomerDal customerDal = new ICustomerDal();
		 * 
		 * bu kullanim yanlis direkt olarak new'lenemezler zaten mantiken interface
		 * icinde bir operasyon yazmadik ki neyi new'lesin
		 * 
		 * bu yuzden yine interface kullanirken polymophism kullanacaz
		 * 
		 */
		ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();

		ICustomerDal customerDal2 = new MySqlCustomerDal();
		customerDal2.add();
		/*
		 * Interface'ler referans tutucudurlar.Yani ICustomerDal interfaces'i hem MySql
		 * ve Oracle'in adresini tutar.Goruldugu gibi ICustomerDal (yani interface'miz )
		 * referans tuttu. Kimi referans tuttu MySqlCustomerDal ve
		 * OracleCustomerDal'i.Evet bir class'a birden fazla interface imlements
		 * edebilir demistik onun bir yazilisini gosterelim ornek olarak ornegin
		 * MySqlCustomerDal class'ina bir tane daha interface implment etmek istersek
		 * public class MySqlCustomerDal implements ICustomerDal , ICustomerDal2
		 * seklinde yani virgul koyarak interface'leri ayiririz
		 */

		System.out.println();

		ICustomerDal[] dals = new ICustomerDal[] { new OracleCustomerDal(), new MySqlCustomerDal() };

		for (ICustomerDal dal : dals) {
			dal.add();
		}
	}
}
