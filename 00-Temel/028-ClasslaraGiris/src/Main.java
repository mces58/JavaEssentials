
public class Main {
	public static void main(String[] args) {
		// classlarin temel amaci programladigimiz kodu gruplara ayirmaktir boylece
		// surdurebilirligi artirmaktir
		// Peki CustomerManager classini nasil cagiracagiz
		// Bunu nesne(referans) olusturarak yapiyoruz
		CustomerManager customerManager = new CustomerManager();
		/* 
		 * evet nesneyi boyle olusturuyoruz. Bunu soyle dusunebiliriz String tipinde
		 * mesaj adli bir degisken olusturmak gibi burada ise CustomerManager tipinde
		 * customerManager adli bir degisken olusturduk.Simdi olusturmus oldugumuz bu
		 * nesne ile CustomerManager classinda ki herseye erisebiliriz .
		 */
		customerManager.add(); // Bu erisimi nokta ile yapiyoruz
		customerManager.delete();
		customerManager.update();

		// simdi iki tane nesne olusturalim birini new'leyerek yapalim digerini
		// new'lemeden yapalim
		CustomerManager customerManager2 = new CustomerManager();
		CustomerManager customerManager3;

		// simdi bu customerManager3 e customerManager2'yi atayalim
		customerManager3 = customerManager2;

		customerManager3.add();
		customerManager3.delete();
		customerManager3.update();
		// goruldugu gibi customerManager3 newlemeden de CustomerManager classinda ki
		// metotlari kullanabiliyorum sebebi customerManager3 zaten customerManager2'nin
		// adresini tutuyor olmasidir
		
		/*
		 
		Simdi burada suna aciklik getirelim nesne nasil olusuyor.
			 
		Bellekte stack ve heap adli iki bolum vardir 
		stack bellekte ki veriler hemen silinirken heap bellekte ki verileri 
		Garbage Collector'a (cop toplama) baglidir.
			 
			 
			 	 Stack                                  Heap
		 	---------------------                ------------------
		 	| CustomerManager2	|                |                |
		 	| customerManager3  |                |                |       
		 	|		            |                |                |
			|	                |                |                |
			---------------------                -------------------			
				  stack 							   heap
			new'lenenin sol tarafi                new'lenen taraf oluyor
					
			stack tarafinda bu customerManager2'ye 
			bir adres ataniyor ornegin 101
			olsun tabi heap kisminda da 101 oluyor
			
			eger ki biz yeni bir nesne daha olusturursak buna da customerManager3 dersek 
			ornegin bununda adresi 102 olsun
			ve bunlari (customerManager3 = customerManager2) birbirinine atarsak 
			customerManager3 yeni adresi 101 olmus olur
			ve dolayisiyla bu 102 de tutulan yer heap kismindan silinir garbage collector yardimiyla 
			ve customerManager3 new'lemeye gerek kalmaz zaten customerManager2'nin adresini tutuyor 
			olacaktir .
					

		Bu anlattiklarimizi yukarida ki kodda gosterdim
		*/
	}
}
