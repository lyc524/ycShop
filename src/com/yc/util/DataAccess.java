package com.yc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataAccess {

	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;	
	
	static{
		DatabaseConfigParsers dcp=new DatabaseConfigParsers();
		try{
			dcp.parse("database.conf.xml");
			Properties dbPro=dcp.getProps();
			driver=dbPro.getProperty(driver);
			url=dbPro.getProperty(url);
			user=dbPro.getProperty(user);
			pwd=dbPro.getProperty(pwd);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
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
