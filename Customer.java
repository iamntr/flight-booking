package ProjectOne.MetroTicket;

import java.util.Date;

public class Customer extends TicketCounter
{
	private int platformNo, passengerCount;
	private double price = 0,passengerMoney;
	private String from, to;
	
	protected Customer(int platformNo, int passengerCount, double price, double passengerMoney, String from,
			String to) {
		this.platformNo = platformNo;
		this.passengerCount = passengerCount;
		this.price = price; 
		this.passengerMoney = passengerMoney;
		this.from = from;
		this.to = to;
	}
	
	public int getPlatformNo() {
		return platformNo;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public double getPrice() {
		return price;
	}

	public double getPassengerMoney() {
		return passengerMoney;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	@Override
	public double changeMoney() {
		double changeMoney = (passengerMoney-(price*passengerCount));
		return changeMoney;
	}

 
	@Override
	public void ticketDetails() {
		System.out.println("\u001b[36m*---------------------------------------------------------------------*");
		System.out.println("*\t\t                                    < * * * * >       *");
		System.out.println("*\t\tL&T Metro Rail                      * HYDRAIL *       *");
		System.out.println("*\t\t        Hyderabad                   < * * * * >       *");
		System.out.println("*---------------------------------------------------------------------*");
		System.out.println("*\t\tAMEERPET PLATFORM ["+getPlatformNo()+"]                                 *");
		System.out.println("*\t\tEquipment ID     - "+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10)+"                               *");
		System.out.println("*\t\tDate & Time      - "+new Date()+"       *");
		System.out.println("*\t\tType             - "+(char)('A'+(int)(Math.random()*26))+(char)('A'+(int)(Math.random()*26))+(char)('A'+(int)(Math.random()*26))+"                                *");
		System.out.println("*\t\tFrom             - "+getFrom()+" "+"                          *");
		System.out.println("*\t\tTo               - "+getTo()+" "+"                           *");
		System.out.println("*\t\tPrice            - "+getPrice()*getPassengerCount()+" "+"                             *");
		System.out.println("*\t\tPassenger Money  - "+getPassengerMoney()+" "+"                             *");
		System.out.println("*\t\tChange Money     - "+changeMoney()+" "+"                              *");
		System.out.println("*\t\tTotal Tickets    - "+getPassengerCount()+"/"+getPassengerCount()+" Tickets Purchased              *");
		System.out.println("*\t\tTicke ID         - "+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10)+" "+"                             *");
		System.out.println("*\t\tPlease keep ticket till the end of journey!           *");
		System.out.println("*\u001B[1m[ 25Kms of Metro travel saves 7kg of carbon emission ]               *");
		System.out.println("*\u001B[1m[ Ticket is non transferable ]                                       *");
		System.out.println("*---------------------------------------------------------------------*");
		System.out.println("*-----------------------[ Thankyou travel again ]---------------------*");
		System.out.println();
	}

}
