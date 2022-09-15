import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Break ---> Donguyu( for , while , do-while ) sonlandirir
		// Continue ---> Altinda ki islemleri yapmadan dongunun basina gider

		// break ornek
		System.out.println("Programdan cikmak icin 1 ' e basiniz...\n");

		while (true) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			System.out.println("Bir karakter giriniz: ");
			String a;
			a = scan.nextLine();

			if (a.equals("1")) {
				System.out.println("Program bitti...");
				break;
			}
		}

		System.out.println("\n****************************");

		// continue ornek
		int i = 0;

		while (i < 10) {
			if (i == 2 || i == 5) {
				// bu if ile 2 ve 5 i ekrana bastirmiyoruz gerci bunu continue yapiyor ve
				// artirma islemi

				i++;
				// eger bu artirmayi yapmaz isek 2 de sonsuz donguye girecek artirarak 2 ve 5 de
				// sonsuz donguden kurtariyoruz
				continue;
			}
			System.out.println("i : " + i);
			i++;
		}
		System.out.println("Dongu bitti...");
	}
}