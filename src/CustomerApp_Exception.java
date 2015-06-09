//Arpita 6/4/2015

public class CustomerApp_Exception extends Exception

{
		private int custNo;

		public int getCustNo() {
			return custNo;
		}

		public void setCustNo(int custNo) {
			this.custNo = custNo;
		}
		
		// Overloading a constructor
		
		//public CustomerApp_Exception()
		{
			
		}
		
		public CustomerApp_Exception(int custNo)
		{
			super("the customer"+custNo+"doesnt exist");
			this.custNo = custNo;
		}
			
}


