package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

	private static String HOST = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";

	public static Connection getConnection() {
		String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + SCHEMA + "?user=" + USER + "&password=" + PASSWORD + "&useSSl=false";
		
		//"jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSl=false"
		
		System.out.println("Connection to schema 'projects' is successful");
		
		try {
			Connection conn = DriverManager.getConnection(url);
			
			return conn;
			
			
		} catch (SQLException e) {
			System.out.println("Connection has failed :(");
			throw new DbException(e);
		}
	}

}
