// -------------------------------// Kevin T. Manley// CSE 593// -------------------------------package flightcode.ResImpl;import carcode.ResImpl.Car;import servercode.ResImpl.*;public class Flight extends ReservableItem{		public Flight( int flightNum, int flightSeats, int flightPrice )		{			super( new Integer(flightNum).toString(), flightSeats, flightPrice );		}		public String getKey()		{			return Flight.getKey( Integer.parseInt( getLocation() ) );		}		public static String getKey( int flightNum )		{			String s = "flight-" + flightNum;			return s.toLowerCase();		}//		public static String getNumReservationsKey( int flightNum )//		{//			String s = "flight-" + flightNum + "-reservations";//			return s.toLowerCase();//		}				public Flight getCopy(){			Flight copy = new Flight(Integer.parseInt(this.getLocation()), this.getCount(), this.getPrice());	    	copy.setReserved(this.getReserved());	    		    	return copy;	    }} 