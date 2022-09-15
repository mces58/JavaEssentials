import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		Connection connection = null;
		DBHelper helper = new DBHelper();
		PreparedStatement preparedStatement = null;// delete isleminde kullaniyoruz
		String delete = "DELETE FROM [SalesLT].[Customer] WHERE CustomerID = ?";
		// soru isaretleri kullanicidan alinir
		// ? yerine id gelirki id uzerinden delete yapilir
		// egerki sorguda where id ifadesini yazmaz isek butun verilerde
		// delete islemi yapar!!!

		try {
			connection = helper.connection();// baglatiyi yap
			preparedStatement = connection.prepareStatement(delete);// delete cumlecigini hazirla
			preparedStatement.setInt(1, 30123);// ? isareti yerine id'yi verdik
			preparedStatement.execute(); // delete islemini calistir
			System.out.println("Kayit silidi.");
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
