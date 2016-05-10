package ch.dubach.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

	private Connection con;
	private String server;
	private String user;
	private String password;
	private String database;
	
	public Database(String server, String user, String password, String database) {
		this.server = server;
		this.user = user;
		this.password = password;
		this.database = database;
	}
	
	public void connect() {
		if (con != null) {
			return;
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Driver not found, Sorry!");
		}

		try {
			String url = "jdbc:mysql://" + server + ":3306/" + database;
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void disconnect() {
		if (con != null) {
			try {
				con.close();
				con = null;
				System.out.println("Database disconnected");
			} catch (SQLException e) {
				System.err.println("Can't close connection");
			}
		}
	}
}
