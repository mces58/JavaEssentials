
public class Main {
	public static void main(String[] args) {
		// bir tane metodu farkli farkli parametreler ile tanimlayarak kullanmaya
		// overloding deniliyor boyle ayni fonk uzerinde islemler yapmak iste
		// parametreleri degistiriyoruz illa void olmasina gerek yok buradakiler ornek

		add(10, 20, 30);
		add(40, 50);

		showScore("can", 2000);
		showScore("ayse");
		showScore(1000);
	}

	public static void add(int number1, int number2, int number3) {
		System.out.println("Total: " + (number1 + number2 + number3));
	}

	public static void add(int number1, int number2) {
		System.out.println("Total: " + (number1 + number2));
	}

	public static void showScore(String name, int score) {
		System.out.println(name + "'s score: " + score);
	}

	public static void showScore(String name) {
		System.out.println(name + "'s score: 0");
	}

	public static void showScore(int score) {
		System.out.println("anonymous player's score: " + score);
	}
}
