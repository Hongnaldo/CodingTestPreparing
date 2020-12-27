<<<<<<< HEAD
import java.util.*;
import java.io.*;
public class 백준11727타일링 {
	static int N;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2; i<=N; i++)
		{
			dp[i] = (dp[i-1] + 2*dp[i-2]) %10007;	// 두칸전에는 | 모양 2개를 붙일수도 있고 정사각형 붙일수도 있기때문에 2가지경우 , 한칸전에는 |밖에못붙임
		
		}
		System.out.println(dp[N]);
		
			
		

	}

}
=======
import java.util.*;
import java.io.*;
public class 백준11727타일링 {
	static int N;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2; i<=N; i++)
		{
			dp[i] = (dp[i-1] + 2*dp[i-2]) %10007;	// 두칸전에는 | 모양 2개를 붙일수도 있고 정사각형 붙일수도 있기때문에 2가지경우 , 한칸전에는 |밖에못붙임
		
		}
		System.out.println(dp[N]);
		
			
		

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
