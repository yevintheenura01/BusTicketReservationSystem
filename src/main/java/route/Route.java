package route;

public class Route {
	private int RID;
	private String date;
	private String depCity;
	private String desCity;
	private String depTime;
	private String arrTime;
	public Route(int rID, String date, String depCity, String desCity, String depTime, String arrTime) {
		RID = rID;
		this.date = date;
		this.depCity = depCity;
		this.desCity = desCity;
		this.depTime = depTime;
		this.arrTime = arrTime;
	}
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getDesCity() {
		return desCity;
	}
	public void setDesCity(String desCity) {
		this.desCity = desCity;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
