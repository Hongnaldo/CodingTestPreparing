import java.util.*;
import java.io.*;
import java.math.*;
public class 백준1018체스판다시칠하기 {
	static int N,M;
	static String[][] arr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new String[N][M];
		
		String[][] chess1 = new String[8][8];
		String[][] chess2 = new String[8][8];
		
		for(int i=0; i<N; i++)
		{
			str = br.readLine();
			
			for(int j=0; j<M; j++)
			{
				arr[i][j] = str.substring(j,j+1);
			}
			
		}
	
		for(int i=0; i<8; i++)
		{
			for(int j=0; j<8; j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						chess1[i][j]="B";
						chess2[i][j]="W";
					}
						
					else
					{
						chess1[i][j]="W";
						chess2[i][j]="B";
					}
						
				}
				else
				{
					if(j%2==0)
					{
						chess1[i][j] ="W";
						chess2[i][j] ="B";
					}
						
					else
					{
						chess1[i][j] = "B";
						chess2[i][j] = "W";
					}
						
				}
			}
		}
		int min = 999999;
		
		String[][] ans = new String[8][8];
		int cnt1 =0;
		int cnt2 = 0;
		for(int i=0; i<N-7; i++)
		{
			for(int j=0; j<M-7; j++)
			{
				for(int k=0; k<8; k++)
				{
					for(int l=0; l<8; l++)
					{
						ans[k][l] = arr[k+i][l+j];
						if(!ans[k][l].equals(chess1[k][l]))
							cnt1++;
						if(!ans[k][l].equals(chess2[k][l]))
							cnt2++;
						
											
					}
				}
				if(cnt1 > cnt2)
				{
					min = Math.min(min, cnt2);
				}
				else
					min = Math.min(min, cnt1);
				cnt1 =0;
				cnt2 =0;
			}
		}
		System.out.println(min);
		
		
		

	}

}
