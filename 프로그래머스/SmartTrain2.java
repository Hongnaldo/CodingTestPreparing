import java.util.*;
import java.io.*;
import java.math.*;
public class SmartTrain2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int max =0;
		for(int i=0; i<10; i++)
		{
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sum = sum + b-a;				// 그 역에서 내리고 타는 사람의 누적합
			
			max = Math.max(max,sum);		// 최댓값 구하는 함수
			
		}
		System.out.println(max);

	}

}
