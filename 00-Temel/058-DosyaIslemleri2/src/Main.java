import java.io.File;

public class Main {
	public static void main(String[] args) {
		createFile();
		getFileInfo();
		deleteFile();
	}

	// dosya olusturmak icin metot
	public static void createFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\058-DosyaIslemleri2\\src\\students.txt";
		File file = new File(path);

		try {
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
			}

			else {
				System.out.println("Dosya zaten var");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// dosyanin bilgileri icin metot
	public static void getFileInfo() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\058-DosyaIslemleri2\\src\\students.txt";
		File file = new File(path);

		if (file.exists()) {// exists dosya varsa demek . Dosya var mi yok mu diye bakar
			System.out.println("Dosya adi: " + file.getName());// dosya adi okur
			System.out.println("Dosyanin yolu: " + file.getAbsolutePath()); // dosyanin yolunu(konumu) okur
			System.out.println("Dosya yazilabilir mi: " + file.canWrite()); // dosyaya bir seyler yazabilir miyiz diye
			System.out.println("Dosya okunabilir mi: " + file.canRead()); // dosyayi okunabilir mi diye bakar
			System.out.println("Dosyanin boyutu (byte): " + file.length()); // dosyanin ici bos oldugu icin sifir dondu
			System.out.println("Kullanilabilir alan: " + file.getFreeSpace());
		}

		else {
			System.out.println("Dosya yok");
		}
	}

	// dosyayi silmek icin
	public static void deleteFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\058-DosyaIslemleri2\\src\\students.txt";
		File file = new File(path);

		if (file.exists()) {
			file.delete();
			System.out.println("Dosya silindi");
		}

		else {
			System.out.println("Silinecek dosya yok");
		}
	}
}
