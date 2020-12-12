package programmers;
import java.util.*;
import java.io.*;
import java.math.*;
public class Backpack {
	static int N;
	static int K;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		int[] w = new int[N];
		int[] v = new int[N];
		int[][] dp = new int[N+1][K+1];
		int max =0;
		for(int i=0; i<N; i++)
		{
			String str1 = br.readLine();
			StringTokenizer st1 = new StringTokenizer(str1);
			w[i] = Integer.parseInt(st1.nextToken());
			v[i] = Integer.parseInt(st1.nextToken());
			
		}
		for(int i=1; i<= N; i++)
		{
			for(int j=1; j<=K; j++)
			{
				if(w[i-1]<= j)
				{
					dp[i][j] = Math.max(v[i-1] + dp[i-1][j-w[i-1]], dp[i-1][j] );
				}
				else
				{
					dp[i][j] = dp[i-1][j];
				}
				max = Math.max(dp[i][j], max);
			}
		}
		System.out.println(max);
		
	}

}
