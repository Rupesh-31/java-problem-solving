package numberProgramming;
import java.util.*;

public class Factors 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList result=new ArrayList();
		int no;
		do {
		System.out.print("Enter the number greater than 0 to find the factor: ");
		no=sc.nextInt();
		}
		while(no<=0);
		result=findFactor(no,result);
		System.out.print("The factors of the given number is: ");
		System.out.println(result);
	}
	public static ArrayList findFactor(int no,ArrayList res) 
	{
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				res.add(i);
			}
		}
		return res;
	}
}