package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.Spring") mantiken @ComponentScan'ne de ihtiyac yok
// cunku artik class'larimizin basinda @Component yok
public class IocConfiguration {
//	bir onceki projemizde calisacagimiz class'in basina @Companent(...) 
//	ifadesini yazmistik bu durum pek kullanisli degil cunku bir suru 
//	paketimizin oldugunu varsayalim Companent annotation'u iceren class'i
//	pakette aramayip bulmak zorundayiz sonra onuda oradan silip yeni calisacagimiz
//	class'in basina yazip tekrardan ona gore calismak zorundayiz. Bu durum her
//	seferinde tekrar edecektir. istemedigimiz olay dolayisiyla biz bu @Companent
//	ifadesinden kurtulup kendi olusturtugumuz configuration class'inda yapmak daha
//	mantikli bunun icin configuration class'imizda bir bean(class) tanimlayarak 
//	yapabiliriz ayni xml dosyasinda yaptigimiz gibi.
//	Fark ettiysen yavas yavas class'i xml dosyasina cevirdik once butun 
//	islemleri xml dosyasinda yaparken simdi xml'i class ortamina cektik

	@Bean // bean(class) oldugunu belirtmemiz gerekiyor
	public CustomerDAO database() {
		// neden interface donderen bir metot yazdik ?
		// cunku CustomerDAO hem MsSqlCustomerDAO'nun hem de MySqlCustomerDAO'nun
		// adresini tutabilir yani CustomerDAO ikisi de olabilir
		// return olarakta MsSqlCustomerDAO'yu da verebiliriz MySqlCustomerDal'yu da
		// verebiliriz. Verdigimiz class'a gore calisacaktir

		// database ismi burada bean id yerine gecer xml dosyasinda oldugu gibi
		return new MsSqlCustomerDAO();
	}

	/*
	 * @Bean(name = "veritabani") diye bir isimlendirme yaparsak bu sefer bean id
	 * veritabani adini alir boylece main'de bu ismi kullanarak calismaliyiz. name
	 * ozelligini vermez isek metot adi bean id olur.
	 * 
	 */
	// bean tanimlama ile artik class'larin basina component yazmaya gerek yok
	// cunku xml dosyasinda bean yazdigimizda component tanimlamiyorduk
	// ayni durum burada da gecerli xml dosyasinda ki bean tanimlamayi
	// simdi bean anatasyonu ile yapiyoruz
}
