import java.util.*;
import java.io.*;
class Wall
{
	int x;
	int y;
	Wall(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class 백준14502연구소 {
	static int N,M;
	static int[][] arr;
	static int[][] carr;
	static ArrayList<Wall> vir = new ArrayList<Wall>();
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int count =0;
	static int max = 0;
	
	public static void copyArr()
	{
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				carr[i][j] = arr[i][j];
			}
		}
	}
	public static void cal()
	{
		count =0;
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(carr[i][j] ==0)
					count++;
			}
		}
		max = Math.max(count, max);
	}
	
	public static void solve(int a, int b)
	{
		Queue<Wall> q = new LinkedList<Wall>();
		q.add(new Wall(a,b));
		
		while(!q.isEmpty())
		{
			Wall temp = q.poll();
			
			for(int i=0; i< 4; i++)
			{
				if(temp.x + dx[i]>= 0 && temp.x + dx[i] <N && temp.y + dy[i]>= 0 && temp.y + dy[i] <M )
				{
					if(carr[temp.x+dx[i]][temp.y+dy[i]] ==0)
					{
						carr[temp.x+dx[i]][temp.y+dy[i]] =2;
						q.add(new Wall(temp.x+dx[i],temp.y+dy[i]));
					}
				}
			}
		}
		
		
		
	}
	public static void dfs(int p, int cnt)
	{
		if(cnt == 3)
		{
			copyArr();
			for(int i=0; i<vir.size(); i++)
			{
				solve(vir.get(i).x, vir.get(i).y);
			}
			
			cal();
			
			return;
			
		}
		
		for(int i = p; i<N*M; i++)
		{
			int x = i/M;
			int y = i%M;
			if(arr[x][y] == 0)
			{
				arr[x][y] =1;
				dfs(i+1,cnt+1);
				arr[x][y] = 0;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		carr = new int[N][M];
		for(int[] a : arr)
			Arrays.fill(a, 0);

		for(int[] a : carr)
			Arrays.fill(a, 0);
		
		
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 2)
					vir.add(new Wall(i,j));
			}
		}
		
		
		
		dfs(0,0);

		System.out.println(max);
		
	}

}
