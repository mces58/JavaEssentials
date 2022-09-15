
public class Main {
	public static void main(String[] args) {
		// polymorphism kullanimi inheritance olan classlarda kullanilir . Yani
		// aralarinda extends olmayan classlarda pek kullanilmaz.

		BaseLogger[] loggers = new BaseLogger[] { new DataBaseLogger(), new FileLogger(), new EmailLogger() };
		// burada BaseLogger turunde bir tane array olusturduk . Elemanlarinin hata
		// vermemesinin nedeni elemanlarin BaseLoggera extends olmus olmasi.

		for (BaseLogger logger : loggers) {
			logger.log("Log mesaji");
		}
		// temelde yaptigimiz class'lari bir diziye atarak for ile hepsine birden mesaj
		// gonderdik iste buna polymorphism deniliyor.

		System.out.println();

		Manager manager = new Manager(new FileLogger());
		manager.add();
		// yarin deseler ki FileLoggera degilde EmailLogger musteri yazilsin
		// denildinde sadece parametreyi degistirecegiz asagida ki gibi

		Manager manager2 = new Manager(new EmailLogger());
		manager2.add();
	}
}
