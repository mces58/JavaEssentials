package com.spring;

public class Main {
	public static void main(String[] args) {
		// IoC = Inversion of Control demektir.
		// bu yapiyi ayaga kaldiran tasarim deseni ise Dependency Injection denir
		// IoC ile birbirinin alternatifi olan isleri yonetiyoruz bunu da
		// dependency injection ile yapabiliriz.
		// birbirinin alternatifi olan isleri ayri class'larda yaziyoruz gibi
		// dusunulebilir ve spagetti koddan uzak durmus oluruz
		// (if kullanimina dikkat et)
		// bir class baska bir class'i kendi icinde new'lememesi gerekir .
		// Peki o class'i baska class icine nasil cagiracaz diyorsan
		// bunu IoC ile yapiyoruz (yani interface kullanarak)
		// bu proje buna ornektir

		CustomerManager manager = new CustomerManager(new OracleCustomerDAO());
		manager.insert();
		// bu sistem suan oracle gore calisir lakin ileride sisteme ornegin
		// mySql destegide getirmek istedigimiz de sistemde sadece notasyonu
		// degistirerek sistemi mySql gore calisir vaziyete getirmis oluruz
		// onu da yapalim ve sisteme mySql destegi getirelim

		CustomerManager manager2 = new CustomerManager(new MySqlCustomerDAO());
		manager2.insert();
		// simdi sadece notasyonu degistirerek sistemi mySql cevirdik

		// peki IoC ile spring bu isin neresinde dersen ?
		// onlarda bu saatten sonra bize kendi kendilerine nesneler
		// uretecekler ve biz artik new'leme yapmayacagiz
		// .... = new CustomerManager(new CustomerDal());
		// bu yapiyi(new'lemeyi) artik spring ve IoC yapacak

	}
}
