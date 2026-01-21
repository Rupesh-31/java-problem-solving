//java program to merge two sorted array and the resultant array also should be sorted 
//note: not to use builtin method for sorting
//ip: a=[2,4,7,9] b=[1,3,5,8]
//op: res=[1,2,3,4,5,7,8,9]
package arrayProgramming;
import java.util.Arrays;
public class MergeTwoSortedArrays 
{
	public static void main(String[] args) 
	{
		int []a= {2,4,7,9};
		int []b= {1,3,5,8};
		int[]res=mergeArray(a,b);
		System.out.println("The merged array of two sorted array: ");
		System.out.println(Arrays.toString(res));
	}
	public static int[] mergeArray(int[]a,int[]b)
	{
		int res[]=new int[a.length+b.length];
		int left=0,right=0,x=0;
		while(left<a.length&&right<b.length)
		{
			if(a[left]<b[right])
				res[x++]=a[left++];
			else
				res[x++]=b[right++];
		}
		while(left<a.length)
			res[x++]=a[left++];
		while(right<b.length)
			res[x++]=b[right++];
		return res;
	}
}