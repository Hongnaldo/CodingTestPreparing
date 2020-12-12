import java.io.*;
import java.util.*;
public class Ipguksimsa {
	
	public static void main(String[] args) {
		int n = 6;
		int[] times = {7,10};
		
		long left =1; 
		long right = 1000000000;
		long answer = 1000000000;
		long mid =0;
		while(left<=right)
		{
			long count = 0;
			mid = (left+right)/2;
			for(int i=0; i<times.length; i++)
			{
				count += mid/times[i];
			}
			if(count>=n)
			{
				if(mid<answer)
				{
					answer = mid;
				}
				right =mid-1;
			}
			if(count<n)
			{
				left = mid +1;
			}
			
			
			
		}
		System.out.println(answer);

	}

}
