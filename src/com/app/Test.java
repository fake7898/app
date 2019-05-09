package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args)throws Exception {
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:oci:@XE";
		String username="system";
		String password="admin";
		
		Class.forName(driver);
	    Connection con= DriverManager.getConnection(url,username,password);
		System.out.println("done");
	}
}
