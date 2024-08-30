package bus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import admin.DBConnect;

public class BusDAO {
	public static boolean isSuccess;
	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet rs =  null;
    public static List<Bus> getAllBuses() {
        ArrayList<Bus> buses = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            System.out.println("database connect una");
            String sql = "SELECT * FROM bus";
            ResultSet rs = stmt.executeQuery(sql);
            
            System.out.println("query eka run una");

            while (rs.next()) {
                String BID = rs.getString(1);
                String busNo = rs.getString(2);
                String type = rs.getString(3);
                String owner = rs.getString(4);
                int capacity = rs.getInt(5);
                
                Bus bus = new Bus(BID, busNo, type, owner, capacity);
                buses.add(bus);
                System.out.println("read wengmn");
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }         

        return buses;
    }
}
