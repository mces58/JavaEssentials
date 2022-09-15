
public class Main {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 6, 8, 45, 84, 131 };
		int checkPoint = 131; // 131 sayisi dizinin icinde var mi yok mu bunu bul
		boolean isThere = false;

		for (int number : numbers) {
			if (checkPoint == number) {
				isThere = true;
				break; // bulunursa donguyu bitir daha aramaya gerek yok o yuzden break yazdik.
			}
		}
		if (isThere) { // bu kullanim sununla aynidir = if(isThere == true)
			System.out.println("Dizinin icinde var.");
		} else {
			System.out.println("Dizinin icinde yok.");
		}

	}
}
