<<<<<<< HEAD
import java.util.*;
import java.io.*;
public class 백준2110공유기설치 {
	static int N,C;
	static int[] arr;
	
	public static void pro()
	{
		int left = 1;
		int right = arr[N-1]-arr[0];
		int ans =0;
		int a=0;
		while(left<=right)
		{
			int mid = (left+right)/2;
			int count =0;
			int fir = arr[0];
			
			for(int i=1; i<N;i++)
			{
				a = arr[i]-fir;
				
				if(a>=mid)
				{
					count++;
					fir = arr[i];
				}
			}
			
			if(count >= C-1)
			{
				ans = mid;
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for(int i=0; i< N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		
		
		pro();
		

	}

}
=======
import java.util.*;
import java.io.*;
public class 백준2110공유기설치 {
	static int N,C;
	static int[] arr;
	
	public static void pro()
	{
		int left = 1;
		int right = arr[N-1]-arr[0];
		int ans =0;
		int a=0;
		while(left<=right)
		{
			int mid = (left+right)/2;
			int count =0;
			int fir = arr[0];
			
			for(int i=1; i<N;i++)
			{
				a = arr[i]-fir;
				
				if(a>=mid)
				{
					count++;
					fir = arr[i];
				}
			}
			
			if(count >= C-1)
			{
				ans = mid;
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for(int i=0; i< N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		
		
		pro();
		

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
