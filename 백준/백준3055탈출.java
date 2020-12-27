<<<<<<< HEAD
import java.util.*;
import java.io.*;

class gosem
{
	int x;
	int y;
	int count;
	gosem(int x, int y, int count)
	{
		this.x = x;
		this.y = y;
		this.count = count;
	}
}
public class น้มุ3055ลปรโ {
	static int R,C;
	static String[][] arr;
	static String[][] copy;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int goX;
	static int goY;
	static int biX;
	static int biY;
	static boolean[][] vi;
	static int min = Integer.MAX_VALUE;
	
	public static void waterCheck(int x, int y)
	{
		for(int i=0; i<R; i++)
		{
			for(int j=0; j<C; j++)
			{
				for(int k=0; k<4; k++)
				{
					if(arr[i][j].equals("*"))
					{
						if(i+dx[k]>0 && i+dx[k]<=R && j+dy[k]>0 && j+dy[k]<=C)
						{
							copy[i+dx[k]][j+dy[k]] = "*";
							
						}
					}
				}
			}
		}
	}
	
	public static void bfs()
	{
		Queue<gosem> q = new LinkedList<gosem>();
		q.add(new gosem(goX,goY,0));
		
		while(!q.isEmpty())
		{
			gosem temp = q.poll();
			
			if(temp.x == biX && temp.y == biY)
			{
				Math.min(temp.count, min);
			}
			
			for(int i=0; i<4; i++)
			{
				if(temp.x == biX && temp.y == biY)
					continue;
				
				if(temp.x+dx[i]>0 && temp.x+dx[i]<=R && temp.y+dy[i]>0 && temp.y+dy[i]<=C)
				{
					if(arr[temp.x+dx[i]][temp.y+dy[i]].equals("."))
					{
						q.add(new gosem(temp.x+dx[i], temp.y+dy[i], temp.count+1));
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		arr = new String[R][C];
		
		for(int i=0; i<R; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++)
			{
				arr[i][j] = st.nextToken();
				copy[i][j] = arr[i][j];
				if(arr[i][j].equals("S"))
				{
					goX = i;
					goY = j;
				}
				if(arr[i][j].equals("D"))
				{
					biX = i;
					biY = j;
				}
			}
		}
		
		for(boolean[] a : vi)
			Arrays.fill(a, false);
		
		bfs();

	}

}
=======
import java.util.*;
import java.io.*;

class gosem
{
	int x;
	int y;
	int count;
	gosem(int x, int y, int count)
	{
		this.x = x;
		this.y = y;
		this.count = count;
	}
}
public class น้มุ3055ลปรโ {
	static int R,C;
	static String[][] arr;
	static String[][] copy;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int goX;
	static int goY;
	static int biX;
	static int biY;
	static boolean[][] vi;
	static int min = Integer.MAX_VALUE;
	
	public static void waterCheck(int x, int y)
	{
		for(int i=0; i<R; i++)
		{
			for(int j=0; j<C; j++)
			{
				for(int k=0; k<4; k++)
				{
					if(arr[i][j].equals("*"))
					{
						if(i+dx[k]>0 && i+dx[k]<=R && j+dy[k]>0 && j+dy[k]<=C)
						{
							copy[i+dx[k]][j+dy[k]] = "*";
							
						}
					}
				}
			}
		}
	}
	
	public static void bfs()
	{
		Queue<gosem> q = new LinkedList<gosem>();
		q.add(new gosem(goX,goY,0));
		
		while(!q.isEmpty())
		{
			gosem temp = q.poll();
			
			if(temp.x == biX && temp.y == biY)
			{
				Math.min(temp.count, min);
			}
			
			for(int i=0; i<4; i++)
			{
				if(temp.x == biX && temp.y == biY)
					continue;
				
				if(temp.x+dx[i]>0 && temp.x+dx[i]<=R && temp.y+dy[i]>0 && temp.y+dy[i]<=C)
				{
					if(arr[temp.x+dx[i]][temp.y+dy[i]].equals("."))
					{
						q.add(new gosem(temp.x+dx[i], temp.y+dy[i], temp.count+1));
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		arr = new String[R][C];
		
		for(int i=0; i<R; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++)
			{
				arr[i][j] = st.nextToken();
				copy[i][j] = arr[i][j];
				if(arr[i][j].equals("S"))
				{
					goX = i;
					goY = j;
				}
				if(arr[i][j].equals("D"))
				{
					biX = i;
					biY = j;
				}
			}
		}
		
		for(boolean[] a : vi)
			Arrays.fill(a, false);
		
		bfs();

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
