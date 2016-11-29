import java.util.ArrayList;

public class EditResev {
	
	static HotelRoom lookupResv(String name, ArrayList<HotelRoom> resvs)
	{
		for (int i = 0 ; i < resvs.size(); i++) {
			HotelRoom hr = (HotelRoom)resvs.get(i);

			if (hr.getGuestName().equalsIgnoreCase(name)) {
				return hr;
			}
		}
		
		return null;
	}
	
	
	static void changeResv(ArrayList<HotelRoom> resvs)
	{
		HotelRoom hr;
		String guestname, roomtype;
		int resvlength;
		
		System.out.print("\nEnter name of guest: ");
		guestname = IO.readString();
		hr = lookupResv(guestname, resvs);
		if (hr == null) {
			System.out.println("\nYou have not yet made a reservation.");
			return;
		}

		while (true) {
			System.out.println("\nReservation for " + guestname + ":");
			System.out.println("Room type: \"" + hr.getRoomType() + "\"");
			System.out.println("Length: " + hr.getReservationLength() + " days");
			System.out.println("Estimated price: $" + hr.getEstimatedPrice());
			
			System.out.println("\nChange Reservation menu:");
			System.out.println("1 - Change room type");
			System.out.println("2 - Change reservation length");
			System.out.println("3 - Return to main menu");
			System.out.println("4 - Quit");

 			System.out.print("\nEnter choice: ");
			int choice = IO.readInt();

			switch (choice) {

				case 1:
					System.out.print("\nEnter type of room: ");
					roomtype = IO.readString();
					hr.setRoomType(roomtype);
					break;
					
				case 2:
					System.out.print("\nEnter reservation length (in days): ");
					resvlength = IO.readInt();
					hr.setReservationLength(resvlength);
					break;
					
				case 3:
					return;
					
				case 4:
					System.exit(0);
					
			}
		}
	}

}
