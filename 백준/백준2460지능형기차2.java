<<<<<<< HEAD
import java.util.*;
import java.io.*;
import java.math.*;
public class ����2460����������2 {

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
			sum = sum + b-a;				// �� ������ ������ Ÿ�� ����� ������
			
			max = Math.max(max,sum);		// �ִ� ���ϴ� �Լ�
			
		}
		System.out.println(max);

	}

}
=======
import java.util.*;
import java.io.*;
import java.math.*;
public class ����2460����������2 {

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
			sum = sum + b-a;				// �� ������ ������ Ÿ�� ����� ������
			
			max = Math.max(max,sum);		// �ִ� ���ϴ� �Լ�
			
		}
		System.out.println(max);

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
