import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	private final String url;
	private final String serverName;
	private final String portNumber;
	private final String dataBaseName;
	private final String userName;
	private final String password;
	private final String encrypt;

	public DBHelper() {
		this.url = "jdbc:sqlserver://";
		this.serverName = "MC_ES58";
		this.portNumber = "1433";
		this.dataBaseName = "AdventureWorksLT2019";
		this.userName = "sa";
		this.password = "12345";
		this.encrypt = "encrypt=true;trustServerCertificate=true;";
	}

	private String getConnectionUrl() {
		// jdbc:sqlserver://MC_ES58:1433;databaseName=AdventureWorksLT2019;
		// user=sa;password=12345;encrypt=true;trustServerCertificate=true;
		return url + serverName + ":" + portNumber + ";databaseName=" + dataBaseName + ";user=" + userName
				+ ";password=" + password + ";" + encrypt;
	}

	public Connection connection() throws SQLException {
		return DriverManager.getConnection(getConnectionUrl());
	}

	public void getErrorMessage(SQLException exception) {
		System.out.println("ERROR: " + exception.getMessage());
		System.out.println("ERROR CODE: " + exception.getErrorCode());
	}
}
