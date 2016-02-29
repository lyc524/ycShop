package com.yc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yc.bean.User;
import com.yc.util.DataAccess;

public class LoginDAO {

	public User Login(String name,String pwd){
		Connection conn=DataAccess.getConn();
		String sql="select * from user where username=? and userpwd=?";
		PreparedStatement pst=null;
		ResultSet rSet=null;
		User pUser=null;
		try{
			pst=conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, pwd);
			rSet=pst.executeQuery();
			if(rSet.next()){
				pUser=new User();
				pUser.setEmail(rSet.getString("email"));
				pUser.setUserName(rSet.getString("username"));
				pUser.setUserPwd(rSet.getString("userpwd"));
				pUser.setTel(rSet.getString("tel"));
			}
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			try{
				if(rSet!=null){
					rSet.close();
				}
				if(pst!=null){
					pst.close();
				}
				if(conn!=null){
					conn.close();
				}
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
		return pUser;
	}
}
