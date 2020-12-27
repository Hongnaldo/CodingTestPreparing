<<<<<<< HEAD
import java.util.*;
import java.io.*;
class chick
{
	int x;
	int y;
	chick(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class 백준15686치킨배달 {
	static int N,M;
	static int[][] arr;
	static boolean[][] vi;
	static ArrayList<chick> home = new ArrayList<chick>();
	static ArrayList<chick> chicken = new ArrayList<chick>();
	static ArrayList<chick> selectchic = new ArrayList<chick>();
	static int answer = Integer.MAX_VALUE;
	
	public static int solve()
	{
		int sum =0;
		for(int i=0; i<home.size(); i++)
		{
			int min = Integer.MAX_VALUE;
			
			for(int j=0; j<M; j++)
			{
				int dist = Math.abs(home.get(i).x - selectchic.get(j).x) + Math.abs(home.get(i).y - selectchic.get(j).y);
				min = Math.min(dist,min);
			}
			sum+= min;
		}
		
		return sum;
	}
			
	public static void dfs(int p, int cnt, ArrayList<chick> selectchic)
	{
		if(cnt == M)
		{
		
			answer = Math.min(solve(),answer);
			return;
		}
		
		for(int i=p; i<chicken.size(); i++)
		{
			selectchic.add(chicken.get(i));
			dfs(i+1, cnt+1, selectchic);
			selectchic.remove(selectchic.size()-1);
		}
	}
		
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		
		for(int[] a : arr)
			Arrays.fill(a, 0);
	
		for(int i=0; i<N; i++)
		{
			str = br.readLine();
			st = new StringTokenizer(str);
			for(int j=0; j<N; j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1)
					home.add(new chick(i,j));
				if(arr[i][j] == 2)
					chicken.add(new chick(i,j));
			}
		}
		
		int p=0;
		int cnt =0;
		dfs(p,cnt,selectchic);
		
		System.out.println(answer);
		
		
		
	}
	

}


=======
import java.util.*;
import java.io.*;
class chick
{
	int x;
	int y;
	chick(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class 백준15686치킨배달 {
	static int N,M;
	static int[][] arr;
	static boolean[][] vi;
	static ArrayList<chick> home = new ArrayList<chick>();
	static ArrayList<chick> chicken = new ArrayList<chick>();
	static ArrayList<chick> selectchic = new ArrayList<chick>();
	static int answer = Integer.MAX_VALUE;
	
	public static int solve()
	{
		int sum =0;
		for(int i=0; i<home.size(); i++)
		{
			int min = Integer.MAX_VALUE;
			
			for(int j=0; j<M; j++)
			{
				int dist = Math.abs(home.get(i).x - selectchic.get(j).x) + Math.abs(home.get(i).y - selectchic.get(j).y);
				min = Math.min(dist,min);
			}
			sum+= min;
		}
		
		return sum;
	}
			
	public static void dfs(int p, int cnt, ArrayList<chick> selectchic)
	{
		if(cnt == M)
		{
		
			answer = Math.min(solve(),answer);
			return;
		}
		
		for(int i=p; i<chicken.size(); i++)
		{
			selectchic.add(chicken.get(i));
			dfs(i+1, cnt+1, selectchic);
			selectchic.remove(selectchic.size()-1);
		}
	}
		
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		
		for(int[] a : arr)
			Arrays.fill(a, 0);
	
		for(int i=0; i<N; i++)
		{
			str = br.readLine();
			st = new StringTokenizer(str);
			for(int j=0; j<N; j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1)
					home.add(new chick(i,j));
				if(arr[i][j] == 2)
					chicken.add(new chick(i,j));
			}
		}
		
		int p=0;
		int cnt =0;
		dfs(p,cnt,selectchic);
		
		System.out.println(answer);
		
		
		
	}
	

}


>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
