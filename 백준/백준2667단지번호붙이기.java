import java.io.*;
import java.util.*;
class Dan
{
	int x;
	int y;
	Dan(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class 백준2667단지번호붙이기 {
	static int N;
	static int[][] arr;
	static int cnt=0;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static ArrayList<Integer> ans = new ArrayList<Integer>();
	public static void dfs(int a, int b)
	{
		Queue<Dan> q = new LinkedList<Dan>();
		q.add(new Dan(a,b));
		
		arr[a][b] =0;
		cnt =1;
		while(!q.isEmpty())
		{
			Dan temp = q.poll();
			
			for(int i=0; i<4; i++)
			{	
				
				if(temp.x +dx[i] >=0 && temp.x+dx[i]<N && temp.y+dy[i]>=0 && temp.y+dy[i]<N && arr[temp.x+dx[i]][temp.y+dy[i]] ==1)
				{
					q.add(new Dan(temp.x+dx[i], temp.y+dy[i]));
					arr[temp.x +dx[i]][temp.y+dy[i]] =0;
					cnt ++;
				}
			}
			
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for(int i=0; i<N; i++)
		{
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for(int j=0; j<N; j++)
			{
				int a = Integer.parseInt(st.nextToken());
				arr[i][j] = a;
			}
		}
		int count =0;
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(arr[i][j] == 1)
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
			System.out.println(ans.get(i));
		
	}

}
