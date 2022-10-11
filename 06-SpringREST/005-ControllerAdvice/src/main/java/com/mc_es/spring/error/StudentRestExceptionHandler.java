package com.mc_es.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// @ControllerAdvice anotasyonu Spring 3.2 ile hayatımıza girmiş ve 
// uygulama üzerinden istemci tarafına iletilecek olan exceptionları 
// yöneterek global exception handling yapmamıza olanak tanımıştır. 
// Bu anotasyonu kullarak uygulamamızın herhangi bir noktasından fırlatılan 
// ve Controller’lar üzerinden istemciye iletilen hataların tiplerini 
// dönüştürebilir, farklı HTTP statü kodlarını kullanarak özelleştirebilir 
// veya ihtiyaçlar doğrultusunda değiştirdiğimiz cevapları istemci tarafına
// iletebiliriz. Bu bağlamda @ControllerAdvice’ı exceptionlar için 
// özelleştirilmiş bir interceptor olarak düşünebiliriz. @ControllerAdvice 
// ile servislerimize ait özel hataları daha iyi yönetebilir, monitör 
// edebilir ve kolay okunabilir kodlar yazabiliriz. Bunların yanı sıra 
// uygulamalarımızdaki unhandled exceptionları da kategorize edebiliriz. 
// Aşağıdaki örnek ile @ControllerAdvice’ın sağladığı faydayı basitçe somutlaştıralım.

// Controller advice sınıfları, uygulamamızdaki birden fazla veya tüm 
// controller için exception handler yazmamıza izin verir.
// 'Advice' terimi, mevcut metodların etrafına cross-cutting kodu 
// ("advice" olarak adlandırılır) enjekte etmemizi sağlayan 
// Aspect-Oriented Programlama (AOP)'dan gelir. Bir controller advice, 
// exception'ları handle etmek için controller metodlarının dönüş değerlerini 
// yakalamamıza ve değiştirmemize olanak tanır.

// Buradaki diğer bir önemli nokta ise, bu handler'ların sadece ProductController 
// tarafından değil, uygulamadaki tüm controller'lar tarafından atılan 
// exceptionlar'ı işliyor olmasıdır. Eğer buna bir sınırlama getirmek istiyorsanız 
// iki farklı yöntemle yapabilirsiniz:
// @ControllerAdvice("com.mc_es.spring"): Anotasyonun değerine veya basePackages 
// parametresine bir paket adı veya paket adları listesi geçirebiliriz. 
// Böylece, controller advice yalnızca bu paketin controller'larının exception'larını işler.

// @ControllerAdvice - MVC ve REST web servislerinde kullanabiliriz
// @RestControllerAdvice = @ControllerAdvice + @ResponseBody -  REST web servislerinde kullanabiliriz
@ControllerAdvice(basePackages = "com.mc_es.spring")
public class StudentRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {

		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value()); // 404, 500..
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	// burada parametreyi exception seklinde gonderdik boylece her turlu hatayi
	// yakalamak mumkun olacak
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {

		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value()); // 404, 500..
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
