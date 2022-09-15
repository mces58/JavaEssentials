
public class Car {
	private String color;
	private String model;
	private double power;
	private int door;
	private double price;

	// contructor'i kisa yoldan alt + shift + s ile yapilabilir
	public Car(String color, String model, double power, int door, double price) {
		this.color = color;
		this.model = model;
		this.power = power;
		this.door = door;
		this.price = price;
	}

	// default constructor yazacagiz asagida
	public Car() {
		/*
		 * this.color = "Bilgi yok";
		 * 
		 * this.model = "Bilgi yok";
		 * 
		 * this.power = 0;
		 * 
		 * this.doors = 0;
		 * 
		 * this.price = 0;
		 */
		// boyle hepsini ayri ayri tanimlamak yerine constructor icinde constructor
		// cagirabiliriz. o yuzden yukardakileri yorum satirina alalim ve en yukarda ki
		// constructor'i bu constructor icinde cagiralim .bunu yapmak icin this
		// kullanacagiz

		this("Bilgi yok", "Bilgi yok", 0, 0, 0);
		// boylece kisa yoldan yapmis olduk. yukardaki tanimlamalar ile ugrasmadik
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public double getPower() {
		return power;
	}

	public int getDoor() {
		return door;
	}

	public double getPrice() {
		return price;
	}
	// CarManager class'inda bu field'lara ulasabilmek icin getter'lari yazdik
	// setter'lara gerek yoktu
}
