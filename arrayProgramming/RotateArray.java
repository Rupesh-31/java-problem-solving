/*
java program to rotate the position of elements present in the array
ip:{1,2,3,4,5} , n=3;
op:{4,5,1,2,3}
*/
package arrayProgramming;

import java.util.Arrays;

public class RotateArray 
{
	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5};
		int n=3;
		for(int i=1;i<=n;i++)
		{
			int first=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
	}
}
