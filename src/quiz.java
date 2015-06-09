

import java.util.InputMismatchException;
import java.util.Scanner;
public class quiz {
	
	public static void main(String[] args)
	{
		
		//trying GIT
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number less than 10: ");
		boolean tryAgain = true;
		while(tryAgain == true)
		{
			try
			{
				int num = sc.nextInt();
				if (num >=10)
					throw new InputMismatchException();
				tryAgain = false;
			}
			
			catch(InputMismatchException ime)
			{
				System.out.print("Enter a valis integer: ");
				System.out.print(tryAgain);
			}
			sc.nextLine();
		}
		
	}

}
