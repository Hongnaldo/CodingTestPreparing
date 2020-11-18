import java.util.*;
import java.io.*;
public class 백준14503로봇청소기 {
	static int[][] arr;
	static int N,M,r,c,d;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		str = br.readLine();
		st = new StringTokenizer(str);
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++)
		{
			String a = br.readLine();
			StringTokenizer b = new StringTokenizer(a);
			for(int j=0; j<M; j++)
			{
				arr[i][j] = Integer.parseInt(b.nextToken());
			}
		}
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int cnt = 1;
		arr[r][c]=2;
		int nd,nx,ny;
		while(true)
		{
			boolean check = false;
			for(int i=0; i<4; i++)
			{
				nd = (d+3)%4;
				nx = r + dx[nd];
				ny = c +dy[nd];
				d = nd;
				if(nx>=0 && nx<N && ny>=0 && ny<M && arr[nx][ny]==0)
				{
					arr[nx][ny] =2;
					r = nx;
					c = ny;
					cnt++;
					check = true;
					break;
				}
			}
			if(check == false)
			{
				if(arr[r-dx[d]][c-dy[d]] == 1)
				{
					break;
				}
				r = r-dx[d];
				c = c-dy[d];
			}
		}
		System.out.print(cnt);
		

	}

}
