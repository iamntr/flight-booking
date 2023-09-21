 package ProjectOne.MetroTicket;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
 
public class MetroTicket {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			while(true) 
			{
				try
				{
					
					System.out.println("\t\t\tWelcome to L&T Rail Services");
					System.out.println("-----------------------------------------------------------------------");
					System.out.print("Enter platform Number   : ");
					int platformNo = sc.nextInt();
					System.out.print("Enter passenger count   : ");
					int passengerCount = sc.nextInt();
					System.out.print("Enter passengerMoney    : ");
					double passengerMoney = sc.nextDouble();
					sc.nextLine();
					System.out.print("Enter start Location    : ");
					String from = sc.nextLine();
					System.out.print("Enter destination       : ");
					String to = sc.nextLine();
					System.out.print("Enter travel price      : ");
					double price = sc.nextDouble();


					if (!from.matches("[a-zA-Z ]+")) {
						throw new InputMismatchException();
					}
					else if (!to.matches("[a-zA-Z ]+")) {
						throw new InputMismatchException();
					}
					
					Customer customer = new Customer(platformNo, passengerCount, price, passengerMoney, from, to);
					customer.changeMoney();
					customer.ticketDetails();
					System.out.println();
					 
				}
				catch(InputMismatchException e)
				{
					System.out.println("\t\tDetails you entered is incorrect");
				}
				catch(NumberFormatException e)
				{
					System.out.println("You have entered an invalid number format string");
				}
				catch(NoSuchElementException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			}
		}
	}
}