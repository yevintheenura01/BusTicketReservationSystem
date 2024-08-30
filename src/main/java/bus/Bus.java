package bus;

public class Bus {
    private String BID;
    private String busNo;
    private String type;
    private String owner;
    private int capacity;

    public Bus() {
        // Default constructor
    }

    public Bus(String BID, String busNo, String type, String owner, int capacity) {
        this.BID = BID;
        this.busNo = busNo;
        this.type = type;
        this.owner = owner;
        this.capacity = capacity;
    }

    public String getBID() {
        return BID;
    }

    public void setBID(String BID) {
        this.BID = BID;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

   
}
