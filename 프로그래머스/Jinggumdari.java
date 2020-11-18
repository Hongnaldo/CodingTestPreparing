import java.util.*;
public class Jinggumdari {

	public static void main(String[] args) {
		int distance = 25;
		int[] rocks = {2,14,11,21,17};
		int n = 2;
		
		Arrays.sort(rocks);
		long left = 1;
		long right = 1000000000;
		long mid;
		long ans = 0;
		while(left<= right)
		{
			int cnt =0;
			int start =0;
			mid = (left+right)/2;
			
			for(int i=0; i<rocks.length;i++)
			{
				if(rocks[i]-start<mid)
					cnt++;
				else
					start = rocks[i];
			}
			
			if(distance -start<mid)
				cnt++;
			if(cnt<=n)
			{
				ans = mid;
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
			
		}
		System.out.println((int)ans);
		
	}

}
