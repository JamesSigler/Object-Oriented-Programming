import java.util.*;

class EncryptNumber 
{
	public static int[] encryption(int[] digits) 
	{
		int[] toEncrypt = digits;
		{
			for(int i = 0; i < 4;i++) 
			{
				toEncrypt[i] = (toEncrypt[i]+7)%10;
				
			}
			int temp = toEncrypt[0];
			toEncrypt[0] = toEncrypt[2];
			toEncrypt[2] = temp;
			temp = toEncrypt[1];
			toEncrypt[1] = toEncrypt[3];
			toEncrypt[3] = temp;
			
			for(int j = 0; j < 4; j++)
			{
				System.out.print(toEncrypt[j] + " ");
			}
			
		}
		return toEncrypt;
	}
}

class DecryptNumber
{

	public static int[] decryption(int[] enDigits)
	{
		int[] toDecrypt = enDigits;
		{
			for(int i = 0; i < 4;i++) 
			{
					toDecrypt[i] = (toDecrypt[i]-7+10)%10;
			}
			int temp = toDecrypt[0];
			toDecrypt[0] = toDecrypt[2];
			toDecrypt[2] = temp;
			temp = toDecrypt[1];
			toDecrypt[1] = toDecrypt[3];
			toDecrypt[3] = temp;
			
			for(int j = 0; j < 4; j++)
			{
				System.out.print(toDecrypt[j] + " ");
			}
		}
		return toDecrypt;
	}
}

public class TestClass
{
	public static void main(String[] args)
	{
		
		int digit = 0;
		Scanner input = new Scanner(System.in);
		
		int[] code = new int[4];
		
		System.out.print("Enter Four Numbers Seperated by Spaces: ");
		for(int i = 0; i < 4; i++) 
		{
			digit = input.nextInt();
			code[i] = digit;
		}
		
		System.out.print("Encrypted Number: ");
		int[] newDigits = EncryptNumber.encryption(code);
		System.out.print("\nDecrypted Number: ");
		DecryptNumber.decryption(newDigits);
		
		input.close();
	}
}
