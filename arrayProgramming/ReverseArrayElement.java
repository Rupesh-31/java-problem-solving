//java program to reverse the position of array elements
package arrayProgramming;

import java.util.Arrays;

public class ReverseArrayElement {
public static void main(String[] args) {
	int []a= {1,2,3,4,7,8,9};
	System.out.println("Array elemnts before reversing");
	System.out.println(Arrays.toString(a));
	int l=0,h=a.length-1;
	while(l<h)
	{
		int temp=a[l];
		a[l]=a[h];
		a[h]=temp;
		l++;
		h--;
	}
	System.out.println("Array elemnts after reversing");
	System.out.println(Arrays.toString(a));
}
}
