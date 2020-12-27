<<<<<<< HEAD
import java.util.*;
import java.io.*;
public class 백준1920수찾기 {
	static int N;
	static int[] nA;
	static int M;
	static int[] mA;
	public static void pro()
	{
		boolean flag = true;
		
		for(int i=0; i<M; i++)
		{
			int min = 0;
			int max = nA.length-1;
			int mid = (min + max)/2;
			while(flag)
			{
				if(mA[i] == nA[mid])
				{
					System.out.println(1);
					break;
				}
				if(mid>=max)
				{
					System.out.println(0);
					break;
				}
				if(mA[i]>nA[mid])
				{
					min = mid;
					if((mid+max)%2 ==1)
						mid = (mid+max)/2+1;
					mid = (mid+max)/2;
				}
				else if(mA[i]<nA[mid])
				{
					max= mid;
					mid = (min+mid)/2;
				}
				
					
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		nA = new int[N];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		for(int i=0; i<N;i++)
			nA[i] = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(br.readLine());
		mA = new int[M];
		str = br.readLine();
		st = new StringTokenizer(str);
		for(int i=0; i<M; i++)
			mA[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(nA);
	
		
		pro();
		
		

	}

}
=======
import java.util.*;
import java.io.*;
public class 백준1920수찾기 {
	static int N;
	static int[] nA;
	static int M;
	static int[] mA;
	public static void pro()
	{
		boolean flag = true;
		
		for(int i=0; i<M; i++)
		{
			int min = 0;
			int max = nA.length-1;
			int mid = (min + max)/2;
			while(flag)
			{
				if(mA[i] == nA[mid])
				{
					System.out.println(1);
					break;
				}
				if(mid>=max)
				{
					System.out.println(0);
					break;
				}
				if(mA[i]>nA[mid])
				{
					min = mid;
					if((mid+max)%2 ==1)
						mid = (mid+max)/2+1;
					mid = (mid+max)/2;
				}
				else if(mA[i]<nA[mid])
				{
					max= mid;
					mid = (min+mid)/2;
				}
				
					
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		nA = new int[N];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		for(int i=0; i<N;i++)
			nA[i] = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(br.readLine());
		mA = new int[M];
		str = br.readLine();
		st = new StringTokenizer(str);
		for(int i=0; i<M; i++)
			mA[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(nA);
	
		
		pro();
		
		

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
