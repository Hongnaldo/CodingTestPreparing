import java.util.*;
import java.io.*;
public class 백준14426접두사찾기 {
	static int N,M;
	static String[] n1;
	static String[] m1;
	static boolean[] vi;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		n1 = new String[N];
		m1 = new String[M];
		vi = new boolean[M];
		for(int i=0; i<N; i++)
			n1[i] = br.readLine();
		
		
		int cnt = 0;
		for(int i=0; i< M; i++)
		{
			m1[i] = br.readLine();
			for(int j=0; j<N; j++)
			{
				if(n1[j].substring(0, m1[i].length()).equals(m1[i]))
				{
					
				}
			}
		}
		
		
		System.out.println(cnt);
	}

}
