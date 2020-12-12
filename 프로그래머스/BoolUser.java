import java.util.*;
public class BoolUser {
	static int answer =0;
	
	
	public static void main(String[] args) {
		int sum =1;
		// TODO Auto-generated method stub
		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned_id = {"*rodo", "*rodo", "******"};
		String[][] str = new String[64][64];
		int cnt =0;
		for(int i=0; i<banned_id.length;i++)
		{
			for(int j=0; j<user_id.length; j++)
			{
				if(banned_id[i].length() != user_id[j].length())
					continue;
				for(int k =0; k<banned_id[i].length(); i++)
				{
					if(banned_id[i].charAt(k) == '*')
					{
						cnt++;
						continue;
					}
					if(banned_id[i].charAt(k) == user_id[j].charAt(k))
					{
						cnt++;
					}
				}
				if(cnt == banned_id[i].length())
				{
					str[i][j] = user_id[j];
				}
			}
			
		}
		
		for(int i=0; i<str.length;i++)
		{
			for(int j=0; j<str.length; j++)
			{
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}

}
// 다시풀어보기!!
