package route;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import admin.DBConnect;

public class RouteDBUtil {
	public static boolean isSuccess;
	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet rs =  null;
	
		public static boolean insertRoute(String RID,String date, String depCity, String desCity, String depTime, String arrTime) {
			boolean isSuccess = false;
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "insert into route values ('"+RID+"','"+date+"','"+depCity+"', '"+desCity+"','"+depTime+"', '"+arrTime+"')";
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
		
		public static List<Route> getAllRoutes() {
	        ArrayList<Route> routes = new ArrayList<>();

	        try {
	            con = DBConnect.getConnection();
	            stmt = con.createStatement();
	            System.out.println("database connect una");
	            String sql = "SELECT * FROM route";
	            ResultSet rs = stmt.executeQuery(sql);
	            
	            System.out.println("query eka run una");

	            while (rs.next()) {
	                int RID = rs.getInt(1);
	                String date = rs.getString(2);
	                String depCity = rs.getString(3);
	                String desCity = rs.getString(4);
	                String depTime = rs.getString(5);
	                String arrTime = rs.getString(6);
	                
	                Route route = new Route(RID, date, depCity, desCity, depTime,arrTime);
	                routes.add(route);
	                System.out.println("read wengmn");
	            }

	            rs.close();
	            stmt.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }         

	        return routes;
	    }
		
		public static boolean routeEdit(String RID, String date, String depCity, String desCity, String depTime, String arrTime ) {
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "UPDATE route set RID = '"+RID+"', date='"+date+"', departureCity='"+depCity+"', destinationCity='"+desCity+"', departureTime='"+depTime+"', arrivalTime= '"+arrTime+"' "
						+ "where RID = '"+RID+"'";
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
		
		public static boolean routeDelete(String id) {
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "DELETE FROM route WHERE RID = '"+id+"'";
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

