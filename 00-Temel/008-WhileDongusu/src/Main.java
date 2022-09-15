import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 3;

		while (i > 0) {
			System.out.println("JAVA");
			i--;
		}
		System.out.println("\nDongu bitti ve dongu degiskenin degeri: " + i + "\n");

		while (i < 3) {
			System.out.println("JAVA");
			i++;
		}
		System.out.println("\nDongu bitti ve dongu degiskenin degeri: " + i + "\n");

		while (i > -1) {
			System.out.println("JAVA");
			i -= 2;
		}
		System.out.println("\nDongu bitti ve dongu degiskenin degeri: " + i + "\n");
		// C ile ayni

		System.out.print("Kac faktoriyeli hesaplamak istiyorsunuz : ");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int sayi;
		sayi = scan.nextInt();

		int temp = sayi;

		int faktoriyel = 1;

		while (sayi >= 1) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println(temp + " faktoriyel : " + faktoriyel + " eder.");
	}
}