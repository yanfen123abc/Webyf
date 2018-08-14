package cn.dw.yf.utils;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class JdbcUtils {

	public static void main(String[] args) {
		JdbcUtils jdbcUtils = new JdbcUtils();
		System.out.println(jdbcUtils.getConnection());
		System.out.println(jdbcUtils.getConnection());
		System.out.println(jdbcUtils.getConnection());
	}
	

	static {
		System.out.println("-----JdbcUtils statics");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
		
	}
	
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
		
	public void close(Connection conn) {
		
		
		try {
			if(conn!=null&&!conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
		
	}
	
	
	
}