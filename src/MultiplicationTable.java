
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] table = new int[10][10];
		int i,j;
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
			{ if(i==0)
			{
				table[i][j]=i;
			}
			else if(j==0)
			{
				table[i][j]=j;
			}
		for(i=1;i<10;i++)
			for(j=1;j<10;j++)
			{
				table[i][j]=(i)*(j);
			}
		
			}

	
	for(i=0;i<10;i++)
	{	
		System.out.print((i+1)+"|"+"\t");
		for(j=0;j<10;j++)
		{		
				if(i==0)
				{
				if(j<9)
				{
				System.out.print("__");
				System.out.print((j+1)+"__"+"\t");
				}
				
				}
				else
				{
					if(table[i][j]!=0)
					{
					System.out.print("  "+table[i][j]+"\t");
					}
				}
		}
		System.out.println("\n");
		}
	
	}

}
	
