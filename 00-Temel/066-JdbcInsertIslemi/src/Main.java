import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		Connection connection = null;
		DBHelper helper = new DBHelper();
		PreparedStatement preparedStatement = null;// insert isleminde kullaniyoruz
		String insert = "insert into [SalesLT].[Customer](Title, FirstName, LastName, EmailAddress, Phone) values(?,?,?,?,?)";
		// soru isaretleri kullanicidan alinir

		try {
			connection = helper.connection();// baglatiyi yap
			preparedStatement = connection.prepareStatement(insert);// insert cumlecigini hazirla

			preparedStatement.setString(1, "Mr.");// 1 yazmamizin nedeni birinci ? yerine geciyor demek
			preparedStatement.setString(2, "Mehmetcan");
			preparedStatement.setString(3, "ESER");
			preparedStatement.setString(4, "can@gmail.com");
			preparedStatement.setString(5, "0534 651 38 64");

			preparedStatement.execute();// insert islemini calistir
			System.out.println("Kayit eklendi");
		}

		catch (SQLException e) {
			helper.getErrorMessage(e);
		}

		finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				helper.getErrorMessage(e);
			}

		}
	}
}
