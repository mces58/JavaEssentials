
public class Main {
	public static void main(String[] args) {
		/*
		 * inheritance bir class'in baska bir class'tan ozeliklerini metotlarini miras
		 * almasidir . Kullanim yerleri olarak birden fazla birbirine benzeyen
		 * class'imiz var ise buralar da kullanilabilir . Bir tane ana class olusturulur
		 * ve diger alt class'lar bu ana class'in ozelliklerini metotlarini alarak
		 * calisir ve surekli olarak kod yazmaya gerek kalmaz
		 * 
		 * Bu ana class'a super class veya base class denir . Bu ana classtan tureyen
		 * class'lara ise derived class veya sub class denir
		 * 
		 * Bir class birden fazla class'i extends edemez .Yani bir class bir class'tan
		 * miras alabilir.
		 */

		Employee employee = new Employee("Can", "Siber guvenlik", 9000);
		employee.show();

		// alt classimizi(sub, derived) nasil burada cagiracagimiza bakalim
		// ayni sekilde nesne olusturup kullaniyoruz arada bir fark yok

		Manager manager = new Manager("Eser", "Machine learning", 5000, 10);// 10 burada kisi sayisi
		manager.show(); // goruldugu gibi Employee'de olan metotu buradan da cagirabildik
		manager.zam(200); // zam mikrari
	}
}
