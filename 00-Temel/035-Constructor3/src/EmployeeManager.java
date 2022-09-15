import java.time.LocalDate;

public class EmployeeManager {
	public double tax(Employee employee) {
		if (employee.getSalary() > 1000) { // 1000 fazla maas aliyorsa vergi odemek zorunda
			return employee.getSalary() * 0.15; // vergi miktarini belirliyoruz
		}
		return 0.; // 1000 liradan az aliyorsa vergi odemiyor dolayisiyla 0 donduruyoruz
	}

	public double bonus(Employee employee) {
		int extraHours = employee.getWorkHours() - 35; // burada extra calisma saatini bulduk
		// bir gunde 9 saat calisirsa hafta 9x5 = 45 saat yapar .Haftasonlari dahil
		// degil. Biz min 35 saat belirledik fazlasi extra saate girer

		if (extraHours > 0) {
			return 100 * extraHours; // extra calismasina karsilik extra para veriyoruz
			// saat basi 100 tl gibi dusunebiliriz
		}
		return 0.; // eger extra saati sifirdan kucukse direkt 0 donuyoruz. yani extra para yok
	}

	public double raise(Employee employee) {
		LocalDate today = LocalDate.now();
		int workPeriod = today.getYear() - employee.getHiredate(); // ne kadar yil calistigini buluyoruz

		if (workPeriod < 10) {// calisma suresi 10 yildan azsa 0.20 zam yapilacak
			return employee.getSalary() * 0.20;
		}

		else if (workPeriod >= 10 && workPeriod < 20) {// calisma suresi 10 ile 20 arasinda 0.50
			return employee.getSalary() * 0.50;
		}

		else { // calisma suresi 20 yildan yazlaysa 0.75 oranlik bir zam yapilacak
			return workPeriod * 0.75;
		}
	}

	public void show(Employee employee) {

		System.out.println("Calisanin adi: " + employee.getName());
		System.out.println("Calisanin odemesi gereken vergisi: " + this.tax(employee) + " TL.");
		System.out.println("Calisanin primi: " + this.bonus(employee) + " TL.");
		System.out.println("Calisana yil sonu eklenecek zam miktari: " + this.raise(employee) + " TL.");

		double totalSalary = employee.getSalary() - this.tax(employee) + this.bonus(employee) + this.raise(employee);

		System.out.println("Calisanin gelecek yil alacagi net maas miktari: " + totalSalary + " TL.");
	}
}
