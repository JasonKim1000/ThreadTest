
public class HappyBus {
	
	public static void main(String[] args){
		BusReservation br = new BusReservation();
		
		PassengerThread pt3 = new PassengerThread(2,br,"Sam");
		PassengerThread pt2 = new PassengerThread(2,br,"Jack");
		PassengerThread pt1 = new PassengerThread(2,br,"Jason");
		
		pt3.start();
		pt1.start();
		pt2.start();
		
		
	}
}
