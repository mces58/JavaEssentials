import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		ArrayList<String> sehirler = new ArrayList<String>();
		// burada <> bu ifade dizinin hangi tipte olacagini soylemek icin var
		// Burada string ile calistik istersek Integer, Double veya Character ile
		// calisabiriz. generic yapinin icine bunlardan birini yazmamiz yeterlidir

		sehirler.add("sivas");
		sehirler.add("balikesir");
		sehirler.add("zonguldak");
		sehirler.add("ankara");
		sehirler.add("bandirma");
		sehirler.add("denizli");

		sehirler.remove("balikesir");
		// 51. derste remove kullanirken indeks uzerinden gitmistim lakin silinecek
		// elemanin adi verilerekte silinebilir

		// burada elemanlarimiz karisik bir sirada bunlari siraya sokmak istersek
		// asagidaki yapiyi kullanacigiz

		Collections.sort(sehirler); // sort siralamak duzenlemek demek

		// arrayListler koleksiyon oldugu icin Collections kullanabiliriz

		for (String sehir : sehirler) { // duzenlendikten sonra yazdirdik
			System.out.println(sehir);
		}
	}
}
