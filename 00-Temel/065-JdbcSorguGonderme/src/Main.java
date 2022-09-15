import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection connection = null;
		DBHelper helper = new DBHelper();
		Statement statement = null;// sql cumlecigi sql ile ilgili islemleri yapar
		ResultSet resultSet = null;// sorgu sonucudur

		try {
			connection = helper.connection();
			statement = connection.createStatement();
			// yapyacagimiz sorgu bu baglantiya gidecek demek
			// yani AdventureWorksLT2019 gidecek demek

			resultSet = statement.executeQuery("select * from [SalesLT].[Customer]");
			// sql cumlecigini calistir demek hangi sql cumlecigi diye merak ediyorsan
			// select * from [SalesLT].[Address] bu cumlecigi calistir demektir

			while (resultSet.next()) {// tek tek gez demek next
				System.out.print(resultSet.getString("FirstName"));
				// musterilerin adlarini yazar. FirstName burada kolon ismi
				System.out.println(" -- " + resultSet.getString("LastName"));
				// musterilerin soyadlarini yazar. LastName burada kolon ismi
			}

		}

		catch (SQLException e) {
			helper.getErrorMessage(e);
		}

		finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
