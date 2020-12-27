import java.io.*;
import java.util.*;
class exit{
	int x;
	int y;
	int z;
	int time;
	exit(int x, int y, int z, int time)
	{
		this.x =x;
		this.y=y;
		this.z=z;
		this.time = time;
	}
}
public class 백준6593상범빌딩 {
	static int L,R,C;
	static String[][][] arr;
	static String start, end;
	static boolean[][][] vi;
	static int a, b,c;
	static boolean flag = true;
	static int[] dx = {1,-1,0,0,0,0};
	static int[] dy = {0,0,1,-1,0,0};
	static int[] dz = {0,0,0,0,1,-1};
	public static void bfs()
	{
		Queue<exit> q = new LinkedList<exit>();
		q.add(new exit(a,b,c,0));
		
		while(!q.isEmpty())
		{
			exit temp = q.poll();
			if(arr[temp.x][temp.y][temp.z].equals("E"))
			{	
				System.out.println("Escaped in " + temp.time +" minute(s).");
				flag = false;
				return;
			}
			for(int i=0; i<6; i++)
			{
				if(temp.x+dx[i]<0 && temp.x+dx[i]>=R && temp.y+dy[i]<0 && temp.y+dy[i]>=C && temp.z+dz[i]<0 && temp.z+dz[i]>=L && vi[temp.x+dx[i]][temp.y+dy[i]][temp.z+dz[i]] ==false
						&& arr[temp.x+dx[i]][temp.y+dy[i]][temp.z+dz[i]].equals("."))
				{
					vi[temp.x+dx[i]][temp.y+dy[i]][temp.z+dz[i]] = true;
					q.add(new exit(temp.x+dx[i], temp.y+dy[i], temp.z+dz[i], temp.time+1));
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		arr = new String[L][R][C];
		vi = new boolean[L][R][C];
		
		for(int i=0; i<L; i++)
		{
			for(int j=0; j<R; j++)
			{
				String str = br.readLine();
				while(str.equals(""))
					str = br.readLine();
				for(int k=0; k<C; k++)
				{
					arr[i][j][k] = str.substring(k,k+1);
					if(arr[i][j][k].equals("S"))
					{
						a=i;
						b=j;
						c=k;
						vi[i][j][k] = true;
					}
				}
				
			}
		}
		bfs();
		if(flag==true)
			System.out.println("Trapped!");
	}

}
