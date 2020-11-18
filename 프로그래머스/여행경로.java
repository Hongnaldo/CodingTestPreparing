
package programmers;
import java.util.*;
class Location
{
    String full;
    String end;
    int count;
    Location(String full, String end, int count)
    {
        this.full = full;
        this.end = end;
        this.count = count;
    }
}

public class 여행경로 {
	
	static ArrayList<String> arr = new ArrayList<String>();
    static boolean[] vi;
    static String answer;
    public static void solve(String end, String[][] tickets, int count)
    {
    	answer += ","+end;
        if(count == tickets.length)
        {
            arr.add(answer);
            return;
        }
        for(int i=0; i<tickets.length; i++)
        {
        	
            if(end.equals(tickets[i][0]) && vi[i] ==false)
            {
                vi[i] = true;
                
                solve(tickets[i][1], tickets, count+1);
                vi[i] = false;
                answer = answer.substring(0,answer.length()-4);
            }
        }
    }
    
	
	public static void main(String[] args) {
		
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL","ICN"}, {"ATL","SFO"}};
		vi = new boolean[tickets.length];
        for(int i=0; i<tickets.length; i++)
        {
            if(tickets[i][0].equals("ICN"))
            {
                answer = "ICN";
                vi[i] = true;
                solve(tickets[i][1], tickets, 1);   
                
            }
            Arrays.fill(vi, false);
        }
        Collections.sort(arr);
        String[] answer1 = arr.get(0).split(",");
        for(int i=0; i<answer1.length; i++)
        {
        	System.out.println(answer1[i]);
        }
        
    }
}
