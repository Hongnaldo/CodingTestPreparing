import java.util.*;
import java.io.*;
public class Cooker {
	static int TC;
	static int N;
	static int[][] arr;
	static boolean[] vi;
	static Stack<Integer> st = new Stack<Integer>();
	
	static int sum1 =0;
	static int sum2 =0;
	static int min = Integer.MAX_VALUE;
	static int diff;
	public static void pro(int p, int cnt)
	{
		
		if(cnt == N/2)
		{
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			for(int i=0; i<N; i++)
			{
				if(vi[i])
				{
					arr1.add(i);
				}
				else
				{
					arr2.add(i);
				}
				
			}
			for(int i=0; i< (N/2); i++)
			{
				for(int j=0; j<(N/2); j++)
				{
					sum1 += arr[arr1.get(i)][arr1.get(j)];
					sum2 += arr[arr2.get(i)][arr2.get(j)];
				}
			}
			diff = Math.abs(sum1-sum2);
			min = Math.min(min, diff);
			sum1=0;
			sum2=0;
			
			return;
		}
		for(int i=p; i<N; i++)
		{
			if(!vi[i])
			{
				
				vi[i] = true;
				pro(i,cnt+1);
				vi[i] = false;
				
			}
		}
		
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TC = Integer.parseInt(br.readLine());
		for(int t=0; t<TC; t++) {
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		vi = new boolean[N];
		Arrays.fill(vi, false);
		for(int i=0; i<N; i++)
		{
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for(int j=0; j<N; j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int p=0;
		int cnt =0;
		pro(p,cnt);
		System.out.println(min);
		}
		

	}

}
