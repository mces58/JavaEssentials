package com.aop.aspect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.aop.entity.Product;

@Aspect
@Component
public class Log {

	// afterReturning calismasi icin ondan once calisan metot basarili bir sekilde
	// calisip bitmis olmalidir. Yani exception atan metotda afterReturning calismaz
	// return eden fonksiyonlarda kullanilir.
	// returning parametresi ile asil metotdan ne return etmis ise burada da onlari
	// yakalayabiliriz.
	// returning = "product" ile parametre olan Product product isimleri ayni
	// olmalidir
	@AfterReturning(pointcut = "execution (* com.aop.business.Manager.findProduct(*))", returning = "product")
	public void afterReturning(JoinPoint joinPoint, Product product) {

		// Burasi pointcut ifadesini yazdirir
		// execution (Product com.aop.business.Manager.findProduct(int))
		System.out.println("Pointcut ifadesi: " + joinPoint);

		// Burasi metodun imzasini yazdirir
		// Product com.aop.business.Manager.findProduct(int)
		Signature signature = joinPoint.getSignature();
		System.out.println("Metodun imzasi: " + signature.getDeclaringTypeName());

		// Burasi metodun parametrelerini yazdirir
		// 0 cunku sifinci indexi gondermisiz
		System.out.print("Metodun parametreleri:");
		Object[] args = joinPoint.getArgs();
		for (Object object : args) {
			System.out.println(object + " ");
		}

		// burasi da metodun return ettigi degeri dosyaya yazdirir
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\03-AOP\\006-AfterReturning\\src\\com\\aop\\";
		String fileName = "log.txt";
		File file = new File(path + fileName);

		try {
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
			} else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path + fileName, true));

			writer.write("Product: " + product.toString());
			writer.newLine();
			writer.write("Pointcut: " + joinPoint.toString());
			writer.newLine();
			writer.write("Signature: " + signature.getDeclaringTypeName());

			System.out.println("Dosyaya yazildi");

			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
