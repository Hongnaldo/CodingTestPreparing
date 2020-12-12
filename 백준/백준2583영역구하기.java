import java.util.*;
import java.io.*;
class Area{
	int x;
	int y;
	Area(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class 백준2583영역구하기 {
	static int M,N,K;
	static int[][] arr;
	static boolean[][] vi;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int cnt =0;
	static ArrayList<Integer> ans = new ArrayList<Integer>(); 
	public static void dfs(int a, int b)
	{
		
		Queue<Area> q = new LinkedList<Area>();
		q.add(new Area(a,b));
		arr[a][b] =1;
		cnt = 1;
		while(!q.isEmpty())
		{
			Area temp = q.poll();
			
			for(int i=0; i<4; i++)
			{	
				
				if(temp.x +dx[i] >=0 && temp.x+dx[i]<N && temp.y+dy[i]>=0 && temp.y+dy[i]<M && arr[temp.x+dx[i]][temp.y+dy[i]] ==0)
				{
					q.add(new Area(temp.x+dx[i], temp.y+dy[i]));
					arr[temp.x +dx[i]][temp.y+dy[i]] =1;
					cnt ++;
				}
			}
			
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for(int[] a : arr)
			Arrays.fill(a, 0);
		vi = new boolean[N][M];
		for(boolean[] bl : vi)
			Arrays.fill(bl, false);
		
		for(int i=0; i<K; i++)
		{
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			for(int j = a; j<c; j++)
			{
				for(int k = b; k<d; k++)
				{
					arr[j][k] = 1;
					vi[j][k] = true;
				}
			}
		}
		int count =0;
		for(int i=0; i<N; i++)
		{
			for(int j=0;j<M;j++)
			{
				if(arr[i][j] == 0)
				{
					dfs(i,j);
					ans.add(cnt);
					count++;
				}
			}
			
		}
		Collections.sort(ans);
		System.out.println(count);
		for(int i=0; i<ans.size(); i++)
		{
			System.out.print(ans.get(i) + " ");
		}

	}

}
