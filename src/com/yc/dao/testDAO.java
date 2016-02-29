package com.yc.dao;


import com.yc.bean.User;

public class testDAO {

	public static void main(String[] args){
		LoginDAO lDao=new LoginDAO();
		User user = lDao.Login("уехЩ", "123");
		if(user!=null){
			System.out.println("login success!");
		}else {
			System.out.println("login failure!");
		}
				
	}
}
