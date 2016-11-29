import java.util.*;

public class MainApp
{
	public static void main(String[] args)
	{
		ArrayList<HotelRoom> resvs;

		resvs = new ArrayList<HotelRoom>();
		
		while (true) {
			System.out.println("\nTest menu:");
			System.out.println("1 - Make new reservation");
			System.out.println("2 - View/change existing reservation");
			System.out.println("3 - Check out of hotel");
			System.out.println("4 - quit");

 			System.out.print("\nEnter choice: ");
			int choice = IO.readInt();

			switch (choice) {

				case 1:
					MakeNewResev.makeNewResv(resvs);
					break;
				
				case 2:
					EditResev.changeResv(resvs);
					break;
				
				case 3:
					CheckOut.checkOut(resvs);
					break;
					
				case 4:
					System.out.println("GoodBye!");
					return;
					
			}
		}
	}
}
