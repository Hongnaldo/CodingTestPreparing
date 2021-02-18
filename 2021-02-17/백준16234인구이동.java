import java.io.*;
import java.util.*;
class population{
	int x;
	int y;
	int sum;
	population(int x, int y, int sum)
	{
		this.x = x;
		this.y = y;
		this.sum = sum;
	}
}
class reset{
	int x;
	int y;
	reset(int x, int y)
	{
		this.x = x;
		this.y=y;
	}
}
public class 백준16234인구이동 {
	static int N,L,R;
	static int[][] arr;
	static boolean[][] vi;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int sum, count;
	static int flag;
	public static void bfs(int x, int y) {
		
		ArrayList<reset> list = new ArrayList<reset>();
		
		Queue<population> q = new LinkedList<population>();
		q.add(new population(x,y,arr[x][y]));
		sum=0; count=0;
		
		while(!q.isEmpty())
		{
			population temp = q.poll();
			list.add(new reset(temp.x,temp.y));
			sum += temp.sum;
			count++;
			
			for(int i=0; i<4; i++)
			{
				int nowX = temp.x+dx[i];
				int nowY = temp.y+dy[i];
				
				if(nowX >=0 && nowX<N && nowY>=0 && nowY<N && vi[nowX][nowY] ==false)
				{
					if(Math.abs(arr[temp.x][temp.y] - arr[nowX][nowY]) >= L && Math.abs(arr[temp.x][temp.y] - arr[nowX][nowY])<=R)
					{
						vi[nowX][nowY] = true;
						q.add(new population(nowX, nowY, arr[nowX][nowY]));
						
					}
				}
			}
			
			
			
		}
		
		
		if(count>1)
			flag++;
		
		for(int i=0; i<list.size(); i++)
		{
			int ax = list.get(i).x;
			int ay = list.get(i).y;
			
			arr[ax][ay] = sum/count;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		arr = new int[N][N];
		vi = new boolean[N][N];
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++)
			{
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer =0;
		while(true)
		{
			flag=0;
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					if(vi[i][j]==false)
					{
						vi[i][j]= true;
						bfs(i,j);
					}
				}
			}
			
			if(flag==0)
				break;
			for(boolean[] a : vi)
				Arrays.fill(a, false);
			
			answer++;
			
		}
		
		System.out.println(answer);
	}

}
