package numberProgramming;
import java.util.Scanner;

public class LeapYear 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the year to find an year is leap year or non-leap year: ");
		int no=sc.nextInt();
		if(isLeapYear(no))
			System.out.println(no+" is a leap year");
		else
			System.out.println(no+" is non-leap year");
	}
	public static boolean isLeapYear(int year)
	{
		return (year%4==0&&year%100!=0)||(year%400==0);
	}
}