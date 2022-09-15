import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// generic classlara tip guvenli calismak icin ihtiyac duyulur

		ArrayList arrayList = new ArrayList();

		arrayList.add("ankara");
		arrayList.add("sivas");
		arrayList.add(1);

		// bu yapida arrayListe her sey eklenebilir. Tip guvenli degildir suan

		ArrayList<String> arrayList2 = new ArrayList<String>(); // lakin bu yapi tip guvenli yapidir

		// yani ozetle <Veri tipi> ---> bu tur yapilara generic denir

		// ArrayListler aslinda birer class'tir. Simdi kendi ArrayList classimizi
		// yazalim. Bu class'in adini MyList veriyorum

		// simdi MyList burada cagiralim

		MyList<String> list = new MyList<String>();
		// String turunde yapmis olduk . Bu String T'nin yerine gecmis oldu

		list.add("sivas");
		list.add("zara");
		list.add("ankara");
		list.remove("ankara");
		// list.add(1); int bir deger ekleyemiyorum cunku String tipinde

		MyList<Customer> list2 = new MyList<Customer>();
		// simdi de Customer turunde olmus oldu

		list2.add(new Customer()); // buda olur

		Customer customer = new Customer(); // buda olur
		list2.remove(customer);
	}
}
