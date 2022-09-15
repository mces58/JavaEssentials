import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		Connection connection = null;
		DBHelper helper = new DBHelper();

		PreparedStatement preparedStatement = null;// update isleminde kullaniyoruz
		String update = "update [SalesLT].[Customer] set FirstName = ? where CustomerID = ?";
		// "update [SalesLT].[Customer] set FirstName = 'Ali',LastName = 'ESER'
		// where id = ?"
		// birden fazlada guncelleme yapabiliriz bunu virgul ile ayirarak yapariz
		// goruldugu gibi LastName bolumunu de update etmis olduk

		// soru isaretleri kullanicidan alinir
		// ? yerine id gelirki id uzerinden update yapalim
		// egerki sorguda where id ifadesini yazmaz isek butun verilerde update islemi
		// yapar!!!

		try {
			connection = helper.connection();// baglatiyi yap
			preparedStatement = connection.prepareStatement(update);// update cumlecigini hazrla
			preparedStatement.setString(1, "Ali");// 1. ? isareti yerine adi verdik
			preparedStatement.setInt(2, 30123);// 2. ? isareti yerine id'yi verdik
			preparedStatement.execute();// update islemini calistir
			System.out.println("Kayit guncellendi");

		} catch (SQLException e) {
			helper.getErrorMessage(e);
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				helper.getErrorMessage(e);
			}
		}
	}
}
