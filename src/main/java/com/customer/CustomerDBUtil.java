package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

	public class CustomerDBUtil {	
			public static boolean insertcustomer(String CardHolderName,String CardNumber,String CVC,String Expiry) {
				boolean isSuccess = false;
				
				//create db connection
				String url = "jdbc:mysql://localhost:3306/buybus";
				String user = "root";
				String pass = "sliit123";
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement stmt = con.createStatement();
					
					String sql = "insert into payment values (0,'"+CardHolderName+"','"+CardNumber+"','"+CVC+"','"+Expiry+"')";
					int rs = stmt.executeUpdate(sql); 
					
					if(rs > 0) {
						isSuccess = true;
					}else {
						isSuccess = false;
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				return isSuccess;
			}
}
