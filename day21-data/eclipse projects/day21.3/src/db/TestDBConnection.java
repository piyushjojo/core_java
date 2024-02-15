package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDBConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/dac22?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		String userName = "root";
		String password = "piyush";
		try (Scanner sc = new Scanner(System.in)) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded JDBC driver class in the method area....");
			Connection cn = DriverManager.getConnection(url, userName, password);
			System.out.println("DB connection established ... " + cn);
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
