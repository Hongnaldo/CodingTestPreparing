<<<<<<< HEAD
import java.util.*;
import java.io.*;
class ice
{
	int x;
	int y;
	ice(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class น้มุ2573บ๙ป๊ {
	static int N,M;
	static int[][] arr1;
	static int[][] arr2;
	static int[][] arr3;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static boolean flag = true;
	static int count =0;
	static int year =0;
	
	public static void solve()
	{
		clear();
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(arr1[i][j] != 0)
				{
					int cnt=0;
					for(int k=0; k<4; k++)
					{
						int nextx = i+dx[k];
						int nexty = j+dy[k];
						if(arr1[nextx][nexty] ==0)
							cnt++;
						
					}
					if(arr1[i][j] <=0)
					{
						arr2[i][j] = 0;
						arr3[i][j] = 0;
					}
					else
					{
						arr2[i][j] = arr1[i][j]-cnt;
						arr3[i][j] = arr1[i][j]-cnt;
					}
					
				}
			}
		}
		year++;
		for(int i=0; i<N;i++)
		{
			for(int j=0; j<M; j++)
			{
				if(arr2[i][j] !=0)
				{
					dfs(i,j);
					count++;
				}
				arr1[i][j] = arr3[i][j];
				
			}
			
		}
		if(count ==2)
		{
			System.out.println(year);
			flag = false;
		}
		count =0;
	}
	
	public static void dfs(int a, int b)
	{
		Stack<ice> stk = new Stack<ice>();
		stk.push(new ice(a,b));
		
		while(!stk.isEmpty())
		{
			ice temp = stk.pop();
			
			for(int i=0; i<4;i++)
			{
				if(temp.x+dx[i] >=0 && temp.x+dx[i] <N && temp.y+dy[i] >=0 && temp.y+dy[i]<M)
				{
					if(arr2[temp.x+dx[i]][temp.y+dy[i]] != 0)
					{
						stk.push(new ice(temp.x+dx[i], temp.y+dy[i]));
						arr2[temp.x+dx[i]][temp.y+dy[i]] = 0;
					}
				}
			}
		}
		
	}
	
	public static void clear()
	{
		for(int[] a : arr2)
			Arrays.fill(a, 0);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr1 = new int[N][M];
		arr2 = new int[N][M];
		arr3 = new int[N][M];
		for(int i=0;i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++)
			{
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		while(flag)
		{
			solve();
		}
		
		
		

	}

}
=======
import java.util.*;
import java.io.*;
class ice
{
	int x;
	int y;
	ice(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class น้มุ2573บ๙ป๊ {
	static int N,M;
	static int[][] arr1;
	static int[][] arr2;
	static int[][] arr3;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static boolean flag = true;
	static int count =0;
	static int year =0;
	
	public static void solve()
	{
		clear();
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(arr1[i][j] != 0)
				{
					int cnt=0;
					for(int k=0; k<4; k++)
					{
						int nextx = i+dx[k];
						int nexty = j+dy[k];
						if(arr1[nextx][nexty] ==0)
							cnt++;
						
					}
					if(arr1[i][j] <=0)
					{
						arr2[i][j] = 0;
						arr3[i][j] = 0;
					}
					else
					{
						arr2[i][j] = arr1[i][j]-cnt;
						arr3[i][j] = arr1[i][j]-cnt;
					}
					
				}
			}
		}
		year++;
		for(int i=0; i<N;i++)
		{
			for(int j=0; j<M; j++)
			{
				if(arr2[i][j] !=0)
				{
					dfs(i,j);
					count++;
				}
				arr1[i][j] = arr3[i][j];
				
			}
			
		}
		if(count ==2)
		{
			System.out.println(year);
			flag = false;
		}
		count =0;
	}
	
	public static void dfs(int a, int b)
	{
		Stack<ice> stk = new Stack<ice>();
		stk.push(new ice(a,b));
		
		while(!stk.isEmpty())
		{
			ice temp = stk.pop();
			
			for(int i=0; i<4;i++)
			{
				if(temp.x+dx[i] >=0 && temp.x+dx[i] <N && temp.y+dy[i] >=0 && temp.y+dy[i]<M)
				{
					if(arr2[temp.x+dx[i]][temp.y+dy[i]] != 0)
					{
						stk.push(new ice(temp.x+dx[i], temp.y+dy[i]));
						arr2[temp.x+dx[i]][temp.y+dy[i]] = 0;
					}
				}
			}
		}
		
	}
	
	public static void clear()
	{
		for(int[] a : arr2)
			Arrays.fill(a, 0);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr1 = new int[N][M];
		arr2 = new int[N][M];
		arr3 = new int[N][M];
		for(int i=0;i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++)
			{
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		while(flag)
		{
			solve();
		}
		
		
		

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
