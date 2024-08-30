package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import admin.DBConnect;

public class PayDBUtil {
	public static boolean isSuccess;
	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet rs =  null;
	
	public static boolean insertPay(String userName,String passengerEmail,String seatQty) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into paydetails values (0,'"+userName+"','"+passengerEmail+"', '"+seatQty+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
