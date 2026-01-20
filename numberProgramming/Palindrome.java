package numberProgramming;
import java.util.*;

public class Palindrome 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to find palindrome or not: ");
		int no=sc.nextInt();
		if(isPalindrome(no))
			System.out.println("The given number is a palindrome number");
		else
			System.out.println("The given number is not a palindrome number");
	}
	public static boolean isPalindrome(int no)
	{
		int safety=no,num=0;
		while(no>0)
		{
			num=(num*10)+(no%10);
			no/=10;
		}
		return safety==num;
	}
}