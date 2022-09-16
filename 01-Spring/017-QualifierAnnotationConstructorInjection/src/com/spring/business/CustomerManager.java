package com.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.dao.CustomerDAO;

@Component
public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	@Autowired
	public CustomerManager(@Qualifier(value = "msSqlCustomerDAO") CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	/*
	 * spesifik olarak belirtmek gerekiyor demistik burada qualifier icine hangi
	 * class ile calismasini gerektigini belirtiyoruz. dikkat etmen gereken sey
	 * component'te de yaptigimiz gibi isimlendirmeyi camel casing seklinde
	 * yapiyoruz.
	 */

	/*
	 * burada camel casing ile bir kac aciklama daha yapmak istiyorum. eger class
	 * adimiz soyle olsaydi RESTCustomerDAO burada default olarak camel casing
	 * uygulanamiyor. cunku ikinci ve ucuncu harfler buyuk diye. Burada value
	 * degerine artik baska bir deger vermek gerekir value = "database" gibi bir
	 * isimlendirme yapilabilir. Bu durum autowired icinde gecerlidir.
	 */

	/*
	 * constructor injection yaparken @qualifier anatasyonunu constructor'a
	 * parametre seklinde verdigimize dikkat et
	 */

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
