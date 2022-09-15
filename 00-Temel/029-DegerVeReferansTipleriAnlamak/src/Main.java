
public class Main {
	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;

		sayi2 = sayi1;
		sayi1 = 30;
		// sayi2 in degeri ne olur ? Cevap = 10.
		System.out.println(sayi2);
		System.out.println(sayi1);
		/*
		simdi burada gerceklesen olayi anlatalim
		 		
		    	stack				iste bu olaylar stack bellekte gerceklesiyor 
		----------------------- 	heap ile isi yok buranin    
	    |                     | 	cunku deger tipli degiskenlerdir bunlar.
		| sayi1 = 10 olustu   |		basit(ilkel) veri tipleri stack ile is gorur.
		| sayi2 = 20 olustu   |		Olayin icine new'leme girince heap de devreye girer
		| 					  |	
		| sonra               |
		|              	      |
		| sayi2 = sayi1       |
		| denildiginde        |
		|                     |
		| sayi2'ye 10         |
		| degeri atandi       |
		|                     |
		| sayi2 = 10 oldu     |
		| sayi1 = 30 oldu     |  
		-----------------------	 
		*/
		
		// simdi ise referans tipli bir ornek verelim
		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 4, 5, 6 };

		sayilar2 = sayilar1;
		sayilar1[0] = 50;
		// sayilar2[0] in degeri ne olur ? Cevap 50.
		System.out.println(sayilar2[0]);
		
		/*
		simdi burada da gerceklesen olayi da anlatalim
		 
		         stack                                     heap
	       -------------------                      -----------------
     	101| sayilar1 olustu |                   101|    1, 2, 3    |
	   	   |                 |                      |               |
        102| sayilar2 olustu |                   102|    4, 5, 6    |
		   |                 |                      |               | 
		   |                 |                      |               |
		   |-----------------|                      |---------------|
		 
		bunlar bellegin iki kisminda da olustu sonra sayilar1 = sayilar2 demisiz
		bunun anlami sayilar2'nin adresini sayilar1'e ata
		bu atama gerceklestigin de sayilar1'de sayilar2'nin de adresi ayni oldu peki 
		bu adresler heap bellekte nereyi gosteriyor? Tabiki 1,2,3 olan 101'i gosteriyor
		yani suan sayilar1 ve sayilar2'de 101 adresi olarak ayni yeri gosteriyorlar.
		 
		 		stack                                   heap
		   -------------------                      -----------------
	  	101|  sayilar1       |                   101|    1, 2, 3    |
		   |                 |                      |               |
        101|  sayilar2       |                   102|    4, 5, 6    |
		   |                 |                      |               | 
		   |                 |                      |               |
		   |-----------------|                      |---------------|
		 
		 
		sonra ne demisiz sayilar[0] = 50 
		 
		 
		    	stack                                heap
		   -------------------                   ----------------
	    101|  sayilar1       |                101|    50, 2, 3  |
		   |                 |                   |              |
        101|  sayilar2       |                102|    4, 5, 6   |
		   |                 |                   |              | 
		   |                 |                   |              |
		   |-----------------|                   |--------------|
		 
		 
		simdi ikiside ayni yeri gosteriyordu 
		 
		sayilar2[0] = 50 olur     sayilar1[0] = 50 olur
		sayilar2[1] = 2 olur      sayilar1[1] = 2 olur
		sayilar2[2] = 3 olur      sayilar1[2] = 3 olur
		
		Dolayisiyla burada iki nesne(sayilar1 ve sayilar2) varmis gibi gorunsede aslinda bir 
		nesne var ve baska bir anlayacagimiz seyde dizilerin referans tipli olmalaridir 
		bu referanslara null degeri atanabilir boylece hic bir yeri gostermeyeceklerdir.
		Lakin primitive(ilkel) tiplere null degeri atanmaz
		
		102 olarak gosterilen yer ise cop toplayicilari ile silinir.
		*/
		
		String sehir1 = "ankara";
		String sehir2 = "istanbul";
		
		sehir1 = sehir2;
		sehir2 = "izmir";
		// sonucu izmir beklerken istanbul cikti oysa Stringlerde referans tiplidir Neden?
		System.out.println(sehir1);
		
		/*
		burada bir istisnai bir durum var normal de stringler arka planda char dizisi gibi duruyor
		yani referans tipli olmasi gerek mantiken sonuc olarakta izmiri yazmasi gerekiyordu lakin 
		yeni nesil programlama da ide'ler bunu programcinin bunu referans tipli degilde deger 
		tipli tutulmasini istedigini anliyor . yani sonuc olarak string'ler de arka planda birer 
		dizi (referans tipli) gibi dursa da aslinda stringler yeni nesilde deger tiplidir.
		*/
	}
}
