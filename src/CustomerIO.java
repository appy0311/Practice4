//Arpita 6/4/2015
public class CustomerIO 
{

	//unchecked exception
    public static Customer getCustomer(int custNo) throws CustomerApp_Exception
    {
        Customer cust = new Customer();
        
        if (custNo == 1000)
        {
            cust.setName("Andrew Antosca");
            cust.setAddress("485 Duane Terrace");
            cust.setCity("Ann Arbor");
            cust.setState("MI");
            cust.setZipCode("48108");
        }
        else if (custNo == 1001)
        {
            cust.setName("Barbara White");
            cust.setAddress("3400 Richmond Parkway #3423");
            cust.setCity("Bristol");
            cust.setState("CT");
            cust.setZipCode("06010");
        }
        else if (custNo == 1002)
        {
            cust.setName("Karl Vang");
            cust.setAddress("327 Franklin Street");
            cust.setCity("Edina");
            cust.setState("MN");
            cust.setZipCode("55435");
        }
        else if (custNo == 1003)
        {
            cust.setName("Ronda Chavan");
            cust.setAddress("518 Comanche Dr.");
            cust.setCity("Greensboro");
            cust.setState("NC");
            cust.setZipCode("27410");
        }
        else if (custNo == 1004)
        {
            cust.setName("Sam Carol");
            cust.setAddress("9379 N. Street");
            cust.setCity("Long Beach");
            cust.setState("CA");
            cust.setZipCode("90806");
        }
       
        else
        {
        	CustomerApp_Exception nce = new CustomerApp_Exception(custNo);
        	throw nce;
      }
        return cust;
        
    }
}

	
