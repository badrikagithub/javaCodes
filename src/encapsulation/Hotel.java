package encapsulation;

public class Hotel
{
	private String hName;
	private String owner;
	private String location;
	private long GSTno;
	private int contactNo;
	
	
	
	public String gethName() 
	{
		return hName;
	}
	public String getOwner()
	{
		return owner;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public void setContactNo(int contactNo)
	{
		this.contactNo = contactNo;
	}
	public long getGSTno() 
	{
		return GSTno;
	}
	public int getContactNo() 
	{
		return contactNo;
	}
	public Hotel()
	{
		System.out.println("no arguments constructure");
	}
	public Hotel(String hName)
	{
		this.hName=hName;
	}

	public Hotel(long GSTno)
	{
		this.GSTno=GSTno;
	}
	public Hotel(int contactNo)
	{
		this.contactNo=contactNo;
	}
	public Hotel(String hName,String owner)
	{
		this(hName);
		this.owner=owner;
	}
	public Hotel(long GSTno,String location)
	{
		this(GSTno);
		this.location=location;
	}
	public Hotel(long GSTno,String location,int contactNo)
	{
		this(GSTno, location);
		this.contactNo=contactNo;
	}
	public Hotel(String hName,long GSTno,String location,int contactNo)
	{
		this(GSTno, location, contactNo);
		this.hName=hName;
		
	}
	public Hotel(String hName,String owner,String location,long GSTno,int contactNo)
	{
		this(hName,GSTno, location, contactNo);
		this.owner=owner;
	}
	
	public void dispiay_HotelDetails()
	{
		System.out.println("Hotel Name"+" "+this.hName);
		System.out.println("Hotel Owner"+" "+this.owner);
		System.out.println("Hotel Location"+" "+this.location);
		System.out.println("Hotel GSTNO"+" "+this.GSTno);
		System.out.println("Hotel ContactNumber"+" "+this.contactNo);
	}
	
	
	
	
	
	

}
