import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		// JDBC bir kutuphane yani bir pakettir

		/*
		 * JAVA APP -----> JDBC -----> -----> DRIVER -----> DATA BASE(veri tabani)
		 * 
		 * jdbc bizim veri tabanina baglanmamizi saglayan bir kutuphanedir driver ise
		 * bir aracidir. yani hangi veri tabani(oracle, mySql, sqlServer...) ile
		 * calisiyorsak onun driver'ini kullaniriz
		 * 
		 * baglantiyi yapabilmek icin driver indirilmesi gerekiyordu indirdim.
		 * Referenced libraries'e connector'u dahil ettik bunu soyle dahil ediyoruz
		 * pojeye sag tiklayip build path'e giriyoruz oradan da configure build path
		 * tikliyoruz sonra libraries bolumune gidiyoruz classpath'e tikliyoruz ve add
		 * external JARS tiklayip connector'un kuruldugu yeri bulup ekliyoruz ben
		 * program files icinde java dizinine kurmustum
		 */
		// boyle baglanti isleri main'de yapilmaz ornek amacli gosteriyorum burada
		// bagalnti isleri icin ayri class'lar olusturulur ve oyle kullanilir

		Connection connection = null;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorksLT2019;user=sa;password=12345;encrypt=true;trustServerCertificate=true;";
		// jdbc:sqlserver://MC_ES58:1433;databaseName=students;user=sa;password=12345;encrypt=true;trustServerCertificate=true;
		// jdbc:sqlserver://MC_ES58;databaseName=students;user=sa;password=12345;encrypt=true;trustServerCertificate=true;
		// bu iki baglanti seklide calisir.
		// sondaki encrypt=true;trustServerCertificate=true; guvenlik ile alakali

		try {
			connection = DriverManager.getConnection(url);
			System.out.println("Sql server baglandi");
		} catch (SQLException e) {
			System.out.println("Sql server baglanamadi. Hata mesaji: " + e.getMessage() + e.getErrorCode());

		} finally {
			try {
				connection.close();
				System.out.println("Baglanti kapandi"); // baglantiyi kapatmayi unutma
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
