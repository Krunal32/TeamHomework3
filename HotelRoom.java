public class HotelRoom
{
	final String singleRoom    = "single";
	final String doubleRoom    = "double";
	final String businessSuite = "business";
	private String guestname;
	private String roomtype;
	private int days;
	private double single = 80.00;
	private double dub = 120.00;	
	private double suite = 200.00;



	// define your fields here

   
	public HotelRoom(String guestname, String roomtype, int days)
	{
		// complete this method	
		this.guestname=guestname;
		this.roomtype=roomtype;
		this.days=days;

	}

	public String getGuestName()
	{
		return guestname; // replace this line with your code
	}

	public String getRoomType()
	{
		return roomtype; // replace this line with your code
	}

	public int getReservationLength()
	{
		return days; // replace this line with your code
	}
    
	public double getEstimatedPrice()
	{
		if(roomtype.equals(singleRoom)){
			return (double) days*single;
		}
		else if(roomtype.equals(doubleRoom)){
			return (double) days*dub;
		}
		else
			return (double) days*suite;
		
	
		 // replace this line with your code
	}

	public void setRoomType(String roomtype)
	{
		if(roomtype.equals(singleRoom)){
			this.roomtype=roomtype;
		}
		if(roomtype.equals(doubleRoom)){
			this.roomtype=roomtype;
		}
		if(roomtype.equals(businessSuite)){
			this.roomtype=roomtype;
		}
	}

	public void setReservationLength(int days)
	{
		
		this.days=days;
		
		// complete this method
	}

	public double getActualPrice(int daysStayed)
	{
		int stay = days-daysStayed;
		int fee = stay*5;
		
		if(roomtype.equals(singleRoom)&&daysStayed<days){
			return (double)daysStayed*single + fee;
		}
		if(roomtype.equals(doubleRoom)&&daysStayed<days){
			return (double) daysStayed*dub+fee;
		}
		if(roomtype.equals(businessSuite)&&daysStayed<days){
			return (double) daysStayed*suite+fee;
		}
		if(roomtype.equals(singleRoom)){
			return (double) daysStayed*single;
		}
		if(roomtype.equals(doubleRoom)){
			return (double) daysStayed*dub;
		}
		else
		
			return (double) daysStayed*suite;
	
		
		 // replace this line with your code
	}

}
