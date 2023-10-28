package encapsulation;

public class Hotel_Driver {

	public static void main(String[] args) 
	{
		Hotel h1=new Hotel("Livya");
		h1.dispiay_HotelDetails();
	    System.out.println("----------------------------------------------");	
		Hotel h2=new Hotel(8574639874512L);
		h2.dispiay_HotelDetails();
		 System.out.println("----------------------------------------------");
		Hotel h3=new Hotel(985674121);
		h3.dispiay_HotelDetails();
		 System.out.println("----------------------------------------------");
		Hotel h4=new Hotel("Livya","Mr.L.K Das");
		h4.dispiay_HotelDetails();
		 System.out.println("----------------------------------------------");
		Hotel h5=new Hotel(5623147859623L,"Delhi");
		h5.dispiay_HotelDetails();
		 System.out.println("----------------------------------------------");
		Hotel h6=new Hotel("PIZZA STUFF","Suresh Dev","Mumbai",25364789654174L,874523615);
		h6.dispiay_HotelDetails();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
