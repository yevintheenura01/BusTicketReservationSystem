package admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class adminDBUtil {
	public static boolean isSuccess;
	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet rs =  null;
	
	
	public static boolean validate(String username, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin where userName = '"+username+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}catch(Exception e) {
			
		}
		
		return isSuccess;
	}
	
	public static List<admin> getAdmin(String username){
		ArrayList<admin> adm = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin where userName = '"+username+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String pass = rs.getString(3);
				
				admin admin = new admin(id, name, pass);
				
				adm.add(admin);
			}
		}catch(Exception e) {
			
		}
		return adm;
	}
}
