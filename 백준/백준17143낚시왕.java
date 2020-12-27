<<<<<<< HEAD
import java.io.*;
import java.util.*;
class shark
{
	int x;
	int y;
	int speed;
	int dir;
	int size;
	shark(int x, int y, int speed, int dir, int size)
	{
		this.x=x;
		this.y=y;
		this.speed = speed;
		this.dir = dir;
		this.size = size;
		
	}
	
	}
public class ¹éÁØ17143³¬½Ã¿Õ {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int R, C, M;
	static int r,c,s,d,z;
	static int[][] tot;
	static ArrayList<shark> arr = new ArrayList<shark>();
	static int answer=0;
	
	public static void kill()
	{
		for(int i=0; i<arr.size(); i++)
		{
			for(int j=i+1; j<arr.size(); j++)
			{
				if(arr.get(i).x == arr.get(j).x && arr.get(i).y == arr.get(j).y)
				{
					if(arr.get(i).size > arr.get(j).size)
					{
						arr.remove(j);
					}
					else if(arr.get(j).size > arr.get(i).size)
					{
						arr.remove(i);
					}
				}
			}
		}
	}
	
	public static void move()
	{
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i).dir == 1 || arr.get(i).dir ==2)
			{
				int temp = (R-1)*2;
				int nextX = arr.get(i).speed % temp;
				arr.get(i).x = nextX;
			}
			else if(arr.get(i).dir == 3 || arr.get(i).dir ==4)
			{
				int temp = (C-1)*2;
				int nextY = arr.get(i).speed % temp;
				arr.get(i).y = nextY;
			}
		}
		
		kill();
	}
	
	public static void solve(int now)
	{
		int min = R;
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i).y == now)
			{
				min = Math.min(min, arr.get(i).x);
			}
			
		}
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i).y == now && arr.get(i).x == min)
			{
				answer += arr.get(i).size;
				arr.remove(i);
			}
		}
		
		move();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<M; i++)
		{
			st= new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			int size = Integer.parseInt(st.nextToken());
			
			arr.add(new shark(x,y,speed,dir,size));
		}
		
		for(int i=1; i<=C; i++)
		{
			solve(i);
		}
		
		System.out.println(answer);
		
	}

}
=======
import java.io.*;
import java.util.*;
class shark
{
	int x;
	int y;
	int speed;
	int dir;
	int size;
	shark(int x, int y, int speed, int dir, int size)
	{
		this.x=x;
		this.y=y;
		this.speed = speed;
		this.dir = dir;
		this.size = size;
		
	}
	
	}
public class ¹éÁØ17143³¬½Ã¿Õ {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int R, C, M;
	static int r,c,s,d,z;
	static int[][] tot;
	static ArrayList<shark> arr = new ArrayList<shark>();
	static int answer=0;
	
	public static void kill()
	{
		for(int i=0; i<arr.size(); i++)
		{
			for(int j=i+1; j<arr.size(); j++)
			{
				if(arr.get(i).x == arr.get(j).x && arr.get(i).y == arr.get(j).y)
				{
					if(arr.get(i).size > arr.get(j).size)
					{
						arr.remove(j);
					}
					else if(arr.get(j).size > arr.get(i).size)
					{
						arr.remove(i);
					}
				}
			}
		}
	}
	
	public static void move()
	{
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i).dir == 1 || arr.get(i).dir ==2)
			{
				int temp = (R-1)*2;
				int nextX = arr.get(i).speed % temp;
				arr.get(i).x = nextX;
			}
			else if(arr.get(i).dir == 3 || arr.get(i).dir ==4)
			{
				int temp = (C-1)*2;
				int nextY = arr.get(i).speed % temp;
				arr.get(i).y = nextY;
			}
		}
		
		kill();
	}
	
	public static void solve(int now)
	{
		int min = R;
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i).y == now)
			{
				min = Math.min(min, arr.get(i).x);
			}
			
		}
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i).y == now && arr.get(i).x == min)
			{
				answer += arr.get(i).size;
				arr.remove(i);
			}
		}
		
		move();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<M; i++)
		{
			st= new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			int size = Integer.parseInt(st.nextToken());
			
			arr.add(new shark(x,y,speed,dir,size));
		}
		
		for(int i=1; i<=C; i++)
		{
			solve(i);
		}
		
		System.out.println(answer);
		
	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
