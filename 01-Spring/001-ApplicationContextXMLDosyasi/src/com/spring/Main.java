package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// spring'i kullanabilmek icin spring'i indiripde kurdugun yerde
		// bir tane xml dosyasi bulunur onu dahil etmeliyiz
		// spring kurdugun yerden xml dosyasini kopyala burada source kismina
		// sag tiklave paste bas
		// sonra xml dosyasina tikla ve xml'in source kismina gel

		// farkettiysen lib diye bir kutuphane var onu nasil ekledimi anlatim
		// 1. adim proje sag tik yap ve new bolumunden bir tane folder ekle adini libs
		// koy.
		// 2. adim spring'i indirdigin yerden gerekli dosyalarin hepsini buraya kopyala
		// yapistir
		// 3. adim libs'e sag tik yapip build path tikla classPath tiklayip addJars
		// tikla ve libs kutuphanesi icindeki her seyi secip okeyle

		// xml'i okumak icin bunu dahil etmeliyiz
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ClassPathXmlApplicatonContext icine xml dosyamizin adini gonderiyoruz

		// context.getBean icine olusturdugumuz nesnenin adini(database) ve
		// OracleCustomerDAO, MySqlCustomerDAO ve MsSqlCustomerDAO'in referansini tutan
		// interface'mizi(CustomerDAO) gonderiyoruz
		// getBean bize new'leme isini yapar

		// simdi business katmanindan ulasmaya calisalim
		CustomerManager customerManager = new CustomerManager(context.getBean("database", CustomerDAO.class));
		// new'leme yapacak bizde bunu context'ten okuduk referensimizin adini verdik ve
		// interface'miz gonderdik
		// interface'de oracle, mysql veya mssql'in adreslerini tuttuguna gore yani bu
		// ucunude gondermis olduk
		// xml'de de hangisi ile calismak istiyorsak o class'in adini yazmak yeterli
		// boylece sadece xml dosyasindan konfugrasyonu degismek yeterli main'de bir
		// degisiklik yapamaya gerek yok

		// bir onceki projede new'leme islemini boyle yapmistik
		// CustomerManager manager = new CustomerManager(new OracleCustomerDal());
		// goruldugu gibi onceden CustomerManager'in icinde new'leme yapiyorduk lakin
		// simdi bizim yerimize xml dosyasi yapiyor
		// bunun avantaji su simdi bu new'leme islemini 100 yerde yaptigini dusun ve
		// sistemi Oracle'dan MySql gecirmen gerek bu sefer 100 yerdeki new
		// OracleCustomerDal() ifadesini
		// silip MySqlCustomerDal() yapman gerek bu durum da kotu bir sey
		// xml bizim yerimize bizim verdigimiz class'i new'liyor ve bize geri veriyor
		// ve boylece tekrarlardan kendimizi kurtariyoruz
		// ama hala bu tarz new'leme islemide iyi degil .hala kotu koddayiz

		customerManager.insert();

		context.close();

		// en kisa sekilde ozetlersek
		// 1- Spring konfigrasyon(xml) dosyasını yükleyin
		// 2- Xml dosyasini oku
		// 3- Bean cagir yani new'leme yap
		// 4- baglantiyi kapat
	}
}
