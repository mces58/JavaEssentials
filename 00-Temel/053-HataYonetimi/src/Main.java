
public class Main {
	public static void main(String[] args) { 
		/*
		String sehir = "ankara";
		int sayi = sehir;
		
		bu kod hic bir sekilde hayata gecmez yani derlenmez. Cunku dil bazinda bir hata yapiyoruz biz bunu 
		yazarken programin alti zaten kirmizi cizgi oluyor. Yani biz bu hatayi gorebiliyoruz. Bu tur kodlar
		programcinin yazarken aldigi hatadir. Gorulmesi kolaydir
		
		Birde uygulama derlenirken alinan hatalar vardir. Bunlari try catch ve finally ile yonettigimiz hatalardir.
		*/
		
		int[] sayilar = new int[] {1,2,3};
		
		System.out.println(sayilar[0]); // burada bir sikinti yok cevap 1
		
		//System.out.println(sayilar[5]); 
		// gorunurde bir hata yok alti kirmizi olmuyor lakin 5'in sinirlarin disinda oldugunu biliyoruz
		// bu kod derlenir ve hatayi ondan sonra bize gosterir. 
		// Bu hata ise ArrayIndexOutOfBoundsException:Index 5 out of bounds for length 3
		// Yani hatamiz : sinirlarin disinda hatasidir
		// dolayisiyla biz kodlarimizi hata yonetimi ile beslememiz gerekir.
		// Bu basit bir ornekti. Gunluk hayatta bunlar veri tabanindan gelir
		
		try {
			
			int[] sayilar2 = new int[] {1,2,3};
			
			System.out.println(sayilar2[1]); // bunu ekrana basti	
			System.out.println(sayilar2[5]); // hatali durum
			
			System.out.println(sayilar2[1]); // bunu ekrana basmadi
		}
		// try blogu icimdeki kodu calistirmayi dene demek
		
		catch (Exception exception){
			//try blogunda olurda bir hata varsa , bu hata catch bloguna parametre olarak gider(gonderilir).
			// Exception hata,siradisi durum demek
			
			System.out.println("Hata olustu: " + exception); // boyle bir mesaj verebiliriz
			// exception ilede hatamizin ne oldugunu gorebiliriz
		}
		/*
		 try-catch bloklari ayni anda calismaz. Ikisinden biri calisir. try blogunda hata varsa catch blogu 
		 calisir. try blogunda hata yoksa try blogu calismaya devam eder. try blogunda ilk hatali kod sonrasi
		 hatasiz kod varsada catch blogu calisir. Yukaridan asagi once hangisi gelirse ona gore calisir. 
		 Yukarida yaptim once 5. indeksi verdim sonra 1. indeksi verdim 5. indeks hatali oldugu icin 
		 catch blogu calisti 1. indeksi ekrana yazdirmadi
		*/
	
		// birde finally blogu vardir. Adi ustunde son calisacak blok demek
		// ister try blogu calissin ister de catch blogu calissin. finally blogu her turlu calisir
		// kullanim yerleri olarak : Veri tabanina baglandik diyelim isimiz bittikten sonra o baglatiyi
		// kapatmak gerekir. Bunu finally blogunda yapilir
		
		
		// System.out.println("can"); 
		//finally varken oncesinde hicbir bloga ait olmayan bir kod varsa. Hata aliriz . Bir blogun icinde olmalidir
		
		finally { // finally blogunda da hata yonetimi yapabiliriz . Her yerde yapabiliriz
			try {
				int[] sayilar3 = new int[] {1,2,3};
				System.out.println(sayilar3[10]);
			}
			
			catch (Exception exception2) {
				System.out.println("\nFinally blogunda hata olustu: " + exception2);
			}
			
			finally {
				System.out.println("icteki Finally blogu");
			}
			System.out.println("distaki finaly blogu");
		}
	     System.out.println("can"); 
		// lakin finally blogundan sonraki kodlarda sikinti yok calismaya devam eder 
	}
}
