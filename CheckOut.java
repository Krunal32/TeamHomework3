import java.util.ArrayList;

public class CheckOut {

	static void checkOut(ArrayList<HotelRoom> resvs)
	{
		HotelRoom hr;
		String guestname, roomtype;
		int days;
		
		System.out.print("\nEnter name of guest: ");
		guestname = IO.readString();
		hr = EditResev.lookupResv(guestname, resvs);
		if (hr == null) {
			System.out.println("\nYou have not yet made a reservation.");
			return;
		}

		System.out.print("Enter actual number of days stayed: ");
		days = IO.readInt();

		System.out.println("\nPrice at checkout: $" + hr.getActualPrice(days));
		resvs.remove(hr);
	}

}
