//java program to remove the duplicate numbers present in the array

package arrayProgramming;
import java.util.Arrays;
public class RemoveDuplicateElement 
{
	public static void main(String[] args) 
	{
		int[]a= {7,3,7,4,1,6,3,2};
		System.out.println("Original Array is: "+Arrays.toString(a));
		System.out.println("Duplicate elements removed array is: "+Arrays.toString(removeDuplicate(a)));
	}
	public static int[] removeDuplicate(int[]a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==Integer.MIN_VALUE)
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=Integer.MIN_VALUE;
					count++;
				}
			}
		}
		int[]res=new int[a.length-count];
		for(int i=0,x=0;i<a.length;i++)
		{
			if(a[i]!=Integer.MIN_VALUE)
				res[x++]=a[i];
		}
		return res;
	}
}