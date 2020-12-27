import java.util.*;
import java.io.*;

class witch		// 자바에서는 페어의 개념이 없기때문에 좌표의 위치 i,j를 저장할 클래스 설계
{
	int i;
	int j;
	witch(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	}
public class Youginongbaechu {
	static int TC;			
	static int M,N,K;		
	static int[][] arr;
	static boolean[][] vi;
	static int count =0;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	public static void dfs(int i, int j)		// 저는 dfs로 풀었습니다.
	{
		Stack<witch> stk = new Stack<witch>();	//스택을 클래스기반을 만들구요
		stk.push(new witch(i,j));
		vi[i][j]= true;
		while(!stk.isEmpty())					//평범한 dfs 이구용
		{
			witch temp = stk.pop();
			for(int k=0; k<4; k++)
			{
				
				int nowX = temp.i+dx[k];
				int nowY = temp.j+dy[k];
				if(nowX>M-1 ||nowX<0 ||nowY>N-1 ||nowY<0)
					continue;
				
				if(arr[nowX][nowY] ==1 && vi[nowX][nowY] ==false)
				{
					vi[nowX][nowY] = true;
					stk.push(new witch(nowX,nowY));
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TC = Integer.parseInt(br.readLine());
		for(int t=0; t<TC; t++) {
			count =0;
		String str= br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		vi = new boolean[M][N];
		
		for(int[] arr1 : arr)
			Arrays.fill(arr1, 0);
		
		for(boolean[] bl : vi)
			Arrays.fill(bl, false);
		
		for(int i=0; i<K; i++)
		{
			String str1 = br.readLine();
			StringTokenizer st1 = new StringTokenizer(str1);
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			arr[a][b] =1;
		
		}
		for(int i=0; i<M; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(arr[i][j] ==1 && vi[i][j] ==false)		// 몇번을 조건에 맞춰 dfs도는지 체크합니다. 
				{
					dfs(i,j);
					count++;
				}
			}
		
		}
		System.out.println(count);
		}
		
	}

}
