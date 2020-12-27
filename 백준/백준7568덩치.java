<<<<<<< HEAD
import java.util.*;
import java.io.*;
public class ¹éÁØ7568µ¢Ä¡ {
	static int N;
	static int[] weight;
	static int[] height;
	static int[] rank;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		weight = new int[N];
		height = new int[N];
		rank = new int[N];
		Arrays.fill(rank, 1);
		for(int i=0;i<N; i++)
		{
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(i==j)
					continue;
				if(weight[i]>weight[j] && height[i]>height[j])
				{
					rank[j]++;
				}
			}
		}
		for(int i=0; i<N; i++)
			System.out.println(rank[i]);
		
	}

}
=======
import java.util.*;
import java.io.*;
public class ¹éÁØ7568µ¢Ä¡ {
	static int N;
	static int[] weight;
	static int[] height;
	static int[] rank;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		weight = new int[N];
		height = new int[N];
		rank = new int[N];
		Arrays.fill(rank, 1);
		for(int i=0;i<N; i++)
		{
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(i==j)
					continue;
				if(weight[i]>weight[j] && height[i]>height[j])
				{
					rank[j]++;
				}
			}
		}
		for(int i=0; i<N; i++)
			System.out.println(rank[i]);
		
	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
