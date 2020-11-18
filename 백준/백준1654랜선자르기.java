import java.util.*;
import java.io.*;
public class 백준1654랜선자르기 {
	static long K,N;
	static long line[];
	public static long pro(long key)
	{
		long left =1;
		long right = key;
		long mid = 0;
		boolean flag = true;
		while(right>=left)
		{
			mid = (left+right)/2;
			int sum =0;
			for(int i=0; i<K; i++)
			{
				sum += line[i]/mid;
			}
			
			if(sum>=N)
			{
				left = mid+1;	
			}
			else if(sum<N)
			{
				right = mid-1;
				
			}
			
			
		}
		
		return right;
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		line = new long[(int) K];
		for(int i=0; i<K; i++)
		{
			line[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(line);
		long key = line[(int) (K-1)];
		
		
		long x =pro(key);
		System.out.println(x);
	}

}
