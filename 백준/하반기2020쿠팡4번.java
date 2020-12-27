<<<<<<< HEAD
import java.util.*;



public class ÇÏ¹Ý±â2020ÄíÆÎ4¹ø {
	static boolean[] vi;
	public static int dfs(String depar, String hub, String[][] ans)
	{
		Queue<String> q = new LinkedList<String>();
		
		q.add(depar);
		int cnt = 0;
		while(!q.isEmpty())
		{
			System.out.println(cnt);
			String cur = q.poll();
			if(cur.equals(hub))
			{
				cnt++;
			}
			
			for(int i=0; i<ans.length; i++)
			{
				if(cur.equals(ans[i][0]))
				{
					
					q.add(ans[i][1]);
				}
			}
		}
		return cnt;
		
		
	}
	public static void main(String[] args) {
		String depar = "SEOUL";
		String hub = "DAEGU";
		String dest = "YEOSU";
		String[][] ans = { {"ULSAN", "BUSAN"}, {"DAEJEON", "ULSAN"}, {"DAEJEON", "GWANGJU"}, {"SEOUL", "DAEJEON"}, {"SEOUL", "ULSAN"}, {"DAEJEON", "DAEGU"}, {"GWANGJU", "BUSAN"}, {"DAEGU", "GWANGJU"}, {"DAEGU", "BUSAN"}, {"ULSAN", "DAEGU"}, {"GWANGJU", "YEOSU"}, {"BUSAN", "YEOSU"} };
		vi = new boolean[12];
		Arrays.fill(vi, false);
		int a =dfs(depar, hub, ans);
		
		depar = hub;
		hub = dest;
		Arrays.fill(vi, false);
		int b =dfs(depar, hub, ans);
		
		System.out.println(a*b);
	}

}
=======
import java.util.*;



public class ÇÏ¹Ý±â2020ÄíÆÎ4¹ø {
	static boolean[] vi;
	public static int dfs(String depar, String hub, String[][] ans)
	{
		Queue<String> q = new LinkedList<String>();
		
		q.add(depar);
		int cnt = 0;
		while(!q.isEmpty())
		{
			System.out.println(cnt);
			String cur = q.poll();
			if(cur.equals(hub))
			{
				cnt++;
			}
			
			for(int i=0; i<ans.length; i++)
			{
				if(cur.equals(ans[i][0]))
				{
					
					q.add(ans[i][1]);
				}
			}
		}
		return cnt;
		
		
	}
	public static void main(String[] args) {
		String depar = "SEOUL";
		String hub = "DAEGU";
		String dest = "YEOSU";
		String[][] ans = { {"ULSAN", "BUSAN"}, {"DAEJEON", "ULSAN"}, {"DAEJEON", "GWANGJU"}, {"SEOUL", "DAEJEON"}, {"SEOUL", "ULSAN"}, {"DAEJEON", "DAEGU"}, {"GWANGJU", "BUSAN"}, {"DAEGU", "GWANGJU"}, {"DAEGU", "BUSAN"}, {"ULSAN", "DAEGU"}, {"GWANGJU", "YEOSU"}, {"BUSAN", "YEOSU"} };
		vi = new boolean[12];
		Arrays.fill(vi, false);
		int a =dfs(depar, hub, ans);
		
		depar = hub;
		hub = dest;
		Arrays.fill(vi, false);
		int b =dfs(depar, hub, ans);
		
		System.out.println(a*b);
	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
