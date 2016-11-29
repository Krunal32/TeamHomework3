import java.util.ArrayList;
public class MakeNewResev {
	

	
		static void makeNewResv(ArrayList<HotelRoom> resvs)
		{
			HotelRoom hr;
			String guestname, roomtype;
			int resvlength;
			
			System.out.print("\nEnter name of guest: ");
			guestname = IO.readString();
			if (EditResev.lookupResv(guestname, resvs) != null) {
				System.out.println("\nYou already have a reservation.");
				return;
			}
					
			System.out.print("Enter type of room: ");
			roomtype = IO.readString();
			System.out.print("Enter reservation length (in days): ");
			resvlength = IO.readInt();

			hr = new HotelRoom(guestname, roomtype, resvlength);
			resvs.add(hr);
			System.out.println("\nReservation made!");
		}

	
}
