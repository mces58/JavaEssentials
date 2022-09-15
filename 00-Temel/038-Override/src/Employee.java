
public class Employee {
	private String name;
	private String department;
	private int salary;

	public Employee(String name, String department, int salary) {
		// constructor olusturduk kisa yol alt + shift + s ile
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public void show() {

		System.out.println("Isim: " + this.name);
		System.out.println("Depertmani: " + this.department);
		System.out.println("Maasi: " + this.salary);

		/*
		 * burada ki show fonksiyonunu manager classinda kullandik ve istedigimiz gibi
		 * uzerinde orada islem yapabiliriz lakin biz bu fonksiyonun dokunulmaz veya
		 * baska classlarda ezilmesini (degistirilmesini ) istemiyorsak sunu
		 * kullanmaliyiz anahtar bir kelime var bu da final keyword'dur bunu
		 * fonksiyonumuzun public'in yanina getirirsek bu fonksiyonumuz baska classlarda
		 * kullanilmaz hale gelir
		 * 
		 * public final void show() ... seklinde
		 */
	}
}
