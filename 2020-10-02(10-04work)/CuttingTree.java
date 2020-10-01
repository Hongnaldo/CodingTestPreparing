import java.util.*;
import java.io.*;
public class CuttingTree {
	static int N,M;
	static long[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new long[N];
		str = br.readLine();
		st = new StringTokenizer(str);
		for(int i=0; i<N; i++)
			arr[i] = Long.parseLong(st.nextToken());
		
		Arrays.sort(arr);
		long mid =0;
		long left =1;
		long right = arr[N-1];
		while(right>=left)
		{
			long sum =0;
			mid = (left+right)/2;
			
			for(int i=0;i<N;i++)
			{
				if(arr[i]-mid>=0)
					sum += arr[i] - mid;
				
			}
			
			if(sum>=M)
				left = mid+1;
			else if(sum<M)
				right = mid-1;
			
		}
		System.out.println(right);
			
	}

}
