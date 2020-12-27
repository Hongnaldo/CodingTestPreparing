<<<<<<< HEAD
import java.util.*;
import java.io.*;
class Move
{
	int x;
	int y;
	int count;
	int wallc;
	Move(int x, int y, int count, int wallc)
	{
		this.x=x;
		this.y=y;
		this.count = count;
		this.wallc = wallc;
	}
	}
public class 백준2206벽부수고이동하기 {
	static int N,M;
	static int arr[][];
	static boolean vi[][][];
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int min = Integer.MAX_VALUE;
	public static void dfs(int a, int b)
	{
		Queue<Move> q = new LinkedList<Move>();
		q.add(new Move(a,b,1,0));
		vi[a][b][0] = true;
		while(!q.isEmpty())
		{
			Move current = q.poll();
			
			if(current.x == N-1 && current.y == M-1)
			{
				min = Math.min(current.count,min);
				
			}
			
			for(int i=0; i<4; i++)
			{
				int nx = current.x+dx[i];
				int ny = current.y + dy[i];
				
				if(nx>=0 && nx<N && ny>=0 && ny<M )
				{
					if(current.wallc == 0) {
						if(arr[nx][ny] ==0 && vi[nx][ny][0] == false)
						{
							q.add(new Move(nx,ny,current.count+1,current.wallc));
							vi[nx][ny][current.wallc] = true;
						}
						else if(arr[nx][ny] == 1 && vi[nx][ny][0] == false)
						{
							q.add(new Move(nx,ny,current.count+1,current.wallc+1));
							vi[nx][ny][1] = true;
						}
					}
					else
					{
						if(arr[nx][ny] ==0 && vi[nx][ny][1]==false)
						{
							q.add(new Move(nx,ny,current.count+1,current.wallc));
							vi[nx][ny][1] = true;
						}
					}
				}
			}
		}
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for(int[] a : arr)
			Arrays.fill(a, 0);
		vi = new boolean[N][M][2];
		
		
		for(int i=0;i<N;i++)
		{
			String str = br.readLine();
			for(int j=0; j<str.length(); j++)
			{
				arr[i][j] = str.charAt(j)-48;
				
			}
			
		}
		
		
		dfs(0,0);
		if(min == Integer.MAX_VALUE)
		{
			System.out.print(-1);
		}
		else
			System.out.println(min);
	}

}
=======
import java.util.*;
import java.io.*;
class Move
{
	int x;
	int y;
	int count;
	int wallc;
	Move(int x, int y, int count, int wallc)
	{
		this.x=x;
		this.y=y;
		this.count = count;
		this.wallc = wallc;
	}
	}
public class 백준2206벽부수고이동하기 {
	static int N,M;
	static int arr[][];
	static boolean vi[][][];
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int min = Integer.MAX_VALUE;
	public static void dfs(int a, int b)
	{
		Queue<Move> q = new LinkedList<Move>();
		q.add(new Move(a,b,1,0));
		vi[a][b][0] = true;
		while(!q.isEmpty())
		{
			Move current = q.poll();
			
			if(current.x == N-1 && current.y == M-1)
			{
				min = Math.min(current.count,min);
				
			}
			
			for(int i=0; i<4; i++)
			{
				int nx = current.x+dx[i];
				int ny = current.y + dy[i];
				
				if(nx>=0 && nx<N && ny>=0 && ny<M )
				{
					if(current.wallc == 0) {
						if(arr[nx][ny] ==0 && vi[nx][ny][0] == false)
						{
							q.add(new Move(nx,ny,current.count+1,current.wallc));
							vi[nx][ny][current.wallc] = true;
						}
						else if(arr[nx][ny] == 1 && vi[nx][ny][0] == false)
						{
							q.add(new Move(nx,ny,current.count+1,current.wallc+1));
							vi[nx][ny][1] = true;
						}
					}
					else
					{
						if(arr[nx][ny] ==0 && vi[nx][ny][1]==false)
						{
							q.add(new Move(nx,ny,current.count+1,current.wallc));
							vi[nx][ny][1] = true;
						}
					}
				}
			}
		}
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for(int[] a : arr)
			Arrays.fill(a, 0);
		vi = new boolean[N][M][2];
		
		
		for(int i=0;i<N;i++)
		{
			String str = br.readLine();
			for(int j=0; j<str.length(); j++)
			{
				arr[i][j] = str.charAt(j)-48;
				
			}
			
		}
		
		
		dfs(0,0);
		if(min == Integer.MAX_VALUE)
		{
			System.out.print(-1);
		}
		else
			System.out.println(min);
	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
