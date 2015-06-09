//Arpita 6/4/2015
import java.util.Scanner;

public class mainapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String y ="y";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer number: ");
		
		while(y.equalsIgnoreCase("y"))
		{
		
		int custNo = sc.nextInt();
		try
		{
			Customer cust = CustomerIO.getCustomer(custNo);
			System.out.println("\n"+cust.toString()+"\n");
		}
		catch(CustomerApp_Exception nce)
		{
			System.out.println("error"+nce.getMessage()+"\n");
			// gets the constructor to run!
		}
		System.out.println("go again?: ");
		y = sc.next();
		}
		
		sc.close();
	}

}
