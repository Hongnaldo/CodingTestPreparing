import java.util.*;
import java.io.*;
public class ����11727Ÿ�ϸ� {
	static int N;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2; i<=N; i++)
		{
			dp[i] = (dp[i-1] + 2*dp[i-2]) %10007;	// ��ĭ������ | ��� 2���� ���ϼ��� �ְ� ���簢�� ���ϼ��� �ֱ⶧���� 2������� , ��ĭ������ |�ۿ�������
		
		}
		System.out.println(dp[N]);
		
			
		

	}

}
