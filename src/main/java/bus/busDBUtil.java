package bus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import admin.DBConnect;


public class busDBUtil {
	public static boolean isSuccess;
	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet rs =  null;
	
		
	public static boolean insertBus(String busID,String busNo, String type, String owner, String cap) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into bus values ('"+busID+"','"+busNo+"','"+type+"', '"+owner+"','"+cap+"')";
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
	
	public static boolean busEdit(String id, String busNo, String type, String owner, String cap) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE bus set busNo='"+busNo+"', type='"+type+"', owner='"+owner+"', capacity='"+cap+"' "
					+ "where BID = '"+id+"'";
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
	
	public static boolean busDelete(String id) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "DELETE FROM bus WHERE BID = '"+id+"'";
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
