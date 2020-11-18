package programmers;
import java.util.*;
class Route
{
	String x;
	String y;
	Route(String x, String y)
	{
		this.x = x;
		this.y = y;
	}
}
public class Travel {
	static boolean[] vi;
	static List<String> lst = new ArrayList<>();
	
	public static void dfs(String[][] tickets, String tic, String first)
	{
		
		
		Stack<Route> stk = new Stack<Route>();
		
		
		stk.push(new Route(first, tic));
		int cnt =1;
		
	
		while(!stk.isEmpty())
		{
			
			Route temp = stk.pop();
			if(cnt ==tickets.length)
			{
				lst.add(temp.y);
			}
			
			for(int i=0; i<tickets.length; i++)
			{
				if(tickets[i][0] == temp.x && vi[i]==false)
				{
					vi[i]=true;
					
					cnt++;
					stk.push(new Route(tickets[i][1],temp.y + "," + tickets[i][1]));
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL","ICN"}, {"ATL","SFO"}};
		vi = new boolean[tickets.length];
		Arrays.fill(vi, false);
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i][0].equals("ICN"))
			{
				vi[i] = true;
				dfs(tickets, tickets[i][0] + "," + tickets[i][1], tickets[i][1]);
				Arrays.fill(vi, false);
			}
		}
		
		Collections.sort(lst);
		String[] answer = lst.get(0).split(",");
		
		for(int i=0;i<lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}

	}

}
