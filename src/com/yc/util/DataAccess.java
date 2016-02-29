package com.yc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataAccess {

	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/yc";
	private static String user="root";
	private static String pwd="123456";	
	
	static{
//		DatabaseConfigParsers dcp=new DatabaseConfigParsers();
//		try{
//			dcp.parse("database.conf.xml");
//			Properties dbPro=dcp.getProps();
//			driver=dbPro.getProperty(driver);
//			url=dbPro.getProperty(url);
//			user=dbPro.getProperty(user);
//			pwd=dbPro.getProperty(pwd);
//			
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}
		
	}
	
	public static Connection getConn(){
		Connection conn=null;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,pwd);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}
}
