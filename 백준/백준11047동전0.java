import java.util.*;
import java.io.*;
public class ����11047����0 {
	static int N,K;
	static Integer[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new Integer[N];
		for(int i=0; i<N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr, Collections.reverseOrder());
		int cnt=0;
		for(int i=0; i <N; i++)
		{
			
			if(K==0)
				break;
			
			if(K / arr[i] !=0)
			{
			cnt += K/arr[i];
			K = K%arr[i];
			}
			
		}
		System.out.println(cnt);
		
	}

}
