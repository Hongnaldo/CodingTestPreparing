<<<<<<< HEAD
import java.io.*;
import java.util.*;
public class ����14425���ڿ����� {
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		HashSet<String> hs = new HashSet<String>();
		for(int i=0; i<N;i++)
			hs.add(br.readLine());
		int ans =0;
		
		for(int i=0; i<M; i++)
		{
			if(hs.contains(br.readLine()))
				ans++;
			
		}
		System.out.println(ans);

	}

}
=======
import java.io.*;
import java.util.*;
public class ����14425���ڿ����� {
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		HashSet<String> hs = new HashSet<String>();
		for(int i=0; i<N;i++)
			hs.add(br.readLine());
		int ans =0;
		
		for(int i=0; i<M; i++)
		{
			if(hs.contains(br.readLine()))
				ans++;
			
		}
		System.out.println(ans);

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
