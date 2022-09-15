import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		createFile();
		readFile();
	}

	public static void createFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\059-DosyaOkuma\\src\\students.txt";
		File file = new File(path);

		try {
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
			}

			else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\059-DosyaOkuma\\src\\students.txt";
		File file = new File(path);

		// okumayi scanner ile yapiyoruz
		// BufferedReared ile de yapabiliriz 54. projede oyle yapmisiz
		try {
			Scanner reader = new Scanner(file);
			String line = null;
			String line2 = " ";

			while (reader.hasNextLine()) {// hasNextLine dosya da yeni satir oldukca dongu calissin demek
				line = reader.nextLine(); // her satiri degiskene at
				line2 = line.concat(line2);// yanyana yazdirmak icin
				System.out.println(line);
			}
			System.out.println(line2);
			reader.close();// dosyayi kapatma islemi
		} catch (FileNotFoundException e) {// dosyanin olmama ihtimali icin
			e.printStackTrace();
		}
	}
}
