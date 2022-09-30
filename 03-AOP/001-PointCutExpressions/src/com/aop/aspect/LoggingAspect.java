package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // Bu class'in aspect oldugunu oyluyoruz
@Component
public class LoggingAspect {

	// execution ( modifiers-pattern? return-type-pattern
	// declaring-type-pattern? method-name-pattern(param-pattern)
	// throws-pattern? )

	// modifiers-pattern = metodun modifiye tipi (public, private) bunu belirtmek
	// zorunlu degil
	// return-type-pattern = metodun donus tipi (String, void, List...)
	// declaring-type-pattern = metodun paket ve class adi. Belirtmek zorunlu degil
	// method-name-pattern = metodun adi
	// param-pattern = metodun parametreleri
	// throws-pattern = exception durumu varsa yazilir. Belirtmek zorunlu degil

	// burada ki pointcut expression'da:
	// public modifiye tipi
	// void donus tipi
	// addAccount ise metod adi. burada ozellikle bir class ismi belirtilmedigi
	// icin addAccount isminde ki tum metodlardan once beforeAddAccount metodu
	// calisir.
	@Before(value = "execution (public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("Before anatasyonu calisti. " + getClass());
	}

	// birde * karakteri vardir.
	// bunun anlami any anlamina gelir.
	// execution (public void add*()):
	// bunun anlami add ile baslayan tum fonksiyonlarda calis demek

	// execution (public * add*()):
	// bunun anlami add ile baslayan ve donus tipi herhangi bir sey olan
	// fonksiyonlarda calis demek

	// execution (* add*()):
	// bunun anlami donus tipinin ne oldugu onemli degil add ile baslayan
	// fonksiyonlarda calis demek
	// burada modifiye tipini belirtmedik o zaten opsiyonel bir sey

	// execution (public void com.aop.dao.AccountDAO.add*()):
	// bunun anlami AccountDAO classinda add ile baslayan metodlarda calis demek

	// parametre olayina geldigimizde ise 3 kullanim vardir:
	// (): bos yani parametre vermeyebiliriz
	// (*): herhangi bir turden bir tane parametre ile eslesir
	// (..): sifir veya birden fazla argumanla herhangi turden olarak eslesir

	// execution public void add*(): parametresiz bir fonksiyon ile eslesir.
	// execution (* com.aop.dao.*.*(..)):
	// bunun anlami donus turu herhangi bir sey, dao pakentinde herhangi bir
	// classta herhangi bir fonksiyon ve parametre alabilir veya almaz demek
}
