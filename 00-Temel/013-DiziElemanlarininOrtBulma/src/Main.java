import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Kac sayi gireceksiniz: ");
		int size = scan.nextInt();

		System.out.println("Sayilari giriniz:");
		int[] numbers = new int[size];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}

		System.out.println("Sayilarin ortalamasi: " + averageValue(numbers));

	}

	public static double averageValue(int[] array) {
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return (double) total / array.length;
	}
}
