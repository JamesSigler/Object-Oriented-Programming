import java.util.*;

public class DigitSeparator 
{
	public static void main(String args[])
	{
	
		Scanner input = new Scanner(System.in);
		boolean	loop = true;
		
		while(loop = true)
		{
			System.out.print("Enter digits with no spaces : ");
			String fullNum = input.next();
	
			if(separate(fullNum) == true)
			{
				loop = false;
			}
			}
		input.close();

		
	}
	
	public static boolean separate(String num)
	{
		
			for(int i = 0; i < num.length(); i++)
			{
				if((int)num.charAt(i) > 57 || (int)num.charAt(i) < 48)
				{
					System.out.print("Only enter numbers.\n");
					return false;
				}

			}
			
			for(int j = 0; j<num.length();j++)
			{
				if(j == 0)
				{
					System.out.print("Seperated numbers: ");	
				}
				
				System.out.printf("%s   ", num.charAt(j) );
			}
			System.out.print("\n");
			return true;
	}
}

