
public class Main {
	public static void main(String[] args) {
		// her is icin metot yazmak gerek don't repeat yourself olmamak icin

		sayHello();
		calculateFact();
		/*
		 * Erisim belirleyici (public...) ekstra ozellikler (static...) 
		 * donus tipi (void, int ...) fonksiyon adi (parametre) {
		 * 
		 * islemler...
		 * 
		 * } seklinde metot tanimlanabilir
		 */
	}

	public static void sayHello() {
		System.out.println("Hello I'm JavaCan.");
		System.out.println("I can calculate factorial for you.Just enter the number.");
	}

	public static void result(String message) {
		System.out.println(message);
	}

	public static void calculateFact() {
		int factorial = 1;
		int number = 5;
		int temp = number;

		while (number >= 1) {
			factorial *= number;
			number--;
		}
		result(temp + " factorial equals " + factorial + ".");
	}
}
