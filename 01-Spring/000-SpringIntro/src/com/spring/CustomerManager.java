package com.spring;

public class CustomerManager {
	private CustomerDAO customerDAO;

	public CustomerManager(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	// iste yukarida ki bu yapiya dependency injection denir
	// kullanmak istedigin class'in interface'si burada field olarak olusturup
	// o class'i kullaniyorsun interface'ler kendisini implemets eden
	// class'larin referanslarini ( adreslerini ) tutabilir

	// OracleCustomerDal dal = new OracleCustomerDal();
	// dal.insert();
	// boyle yapsaydik sistem oracle bagli olacakti ve biz mySqle gecis
	// yapamayacaktik

	public void insert() {
		customerDAO.insert();// oracle ekleme islemini burada cagiriyoruz veya
		// mysql hangisini kullaniyorsak
	}
}
