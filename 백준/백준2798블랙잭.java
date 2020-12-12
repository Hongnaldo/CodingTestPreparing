import java.util.*;
import java.io.*;
class Black
{
	int x;
	int y;
	Black(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	}
public class ¹éÁØ2798ºí·¢Àè {
	static int N;
	static int M;
	static int[] arr;
	static int min =300000;
	static boolean[] vi = new boolean[100001];
	
	public static void pro(int p, int cnt, int sum)
	{
		
		if(cnt ==3)
		{
			if(M-sum >0)
			{
				if(M-sum<min)
				{
					min = M-sum;
				}
				
				
			}
			return;
		}
		
		
		
		
		
			for(int i=p; i< arr.length; i++)
			{
				if(!vi[i])
				{
					vi[i] = true;
					pro(i,cnt+1,sum+arr[i]);
					vi[i] = false;
				}
			}
			
		
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		Arrays.fill(vi, false);
		
		
		String str2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(str2);
		for(int i=0; i<N; i++)
			arr[i] = Integer.parseInt(st2.nextToken());
		
		int p =0;
		int cnt =0;
		int sum=0;
		 pro(p,cnt, sum);
		 System.out.println(M-min);
			
			

	}

}
