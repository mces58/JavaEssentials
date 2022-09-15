
public class Main {
	public static void main(String[] args) {

		BaseKrediManager krediManager = new TarimKrediManager();
		System.out.println(krediManager.hesapla(1000));

		BaseKrediManager krediManager2 = new OgrenciKrediManager();
		System.out.println(krediManager2.hesapla(1000));

		// dikkat et ki burada BaseKrediManager ile baslayip TarimKrediManager ile
		// nesneyi tanimladik polymorphism kullanimi cunku BaseKrediManager class'i
		// TarimKrediManager ile OgrenciKrediManager class'larini tutabilmektedir
	}
}
