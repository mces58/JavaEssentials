import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\057-DosyaIslemleri\\src\\students.txt";
		File file = new File(path);

		// dosyanin olmama durumuna karsin hata yonetimi yaptik
		try {
			// file.createNewFile(); // olusturdugumuz file dosyasinin icine
			// students metin dosyasini olusturuyor normalde students.txt ben
			// elimle olusturmadim bilgisayarin olusturmasini soyluyorum
			// ama createNewFile boolean turundedir onu if else ile kullanalim
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
				// dosya hic yoksa bu calisir
			}

			else {
				System.out.println("Dosya zaten mevcut");
				// dosya olusmussa(varsa) bu calisir
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			file.delete(); // dosyayi siler
			System.out.println("Dosya silindi");
		}
	}
}
