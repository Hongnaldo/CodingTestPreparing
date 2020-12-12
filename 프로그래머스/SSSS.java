
public class SSSS {

	public static void main(String[] args) {
		//String new_id =	"...!-_.@BaT#*..y.abcdefghijklm";
		String new_id =".........ekbk3............................fekkbwk....";
		 String answer = "";
			for(int i=0; i<new_id.length(); i++)
			{
				if(new_id.charAt(i)<91 && new_id.charAt(i)>64)
					new_id = new_id.toLowerCase();
			}
	        
			
	        for(int i=0; i<new_id.length(); i++)
	        {
	            if(new_id.charAt(i)<123 && new_id.charAt(i)>96)
	            {
	                answer += new_id.substring(i,i+1);
	            }
	            if(new_id.charAt(i) =='.' ||new_id.charAt(i)=='-' || new_id.charAt(i) =='_')
	            {
	                answer += new_id.substring(i,i+1);
	            }
	            if(new_id.charAt(i)<58 && new_id.charAt(i)>47)
	            {
	                answer += new_id.substring(i,i+1);
	            }
	        }
	        
	        String s = "";
	        for(int i=0; i<answer.length(); i++)
	        {
	            s += ".";
	        }
	        String s1 =s;
	        System.out.println(s1);
	        
	        System.out.println(answer.length());
	        for(int i=0; i<s.length(); i++)
	        {	
	        	if(s1.length()>1) {
	        	s1 = s1.substring(0, s1.length()-1);
	        	}
	        	answer = answer.replace(s1, ".");
	        	System.out.println(s1);
	        }
	        
	        
	        if(answer.substring(0,1).equals("."))
	            answer = answer.substring(1);
	        if(answer.length() != 0)
	        {if(answer.substring(answer.length()-1,answer.length()).equals("."))
	            answer = answer.substring(0,answer.length()-1);}
	        
	        if(answer.length()==0)
	            answer +="a";
	        
	        if(answer.length() >=16)
	            answer = answer.substring(0,15);
	        if(answer.length() != 0)
	        {if(answer.substring(answer.length()-1,answer.length()).equals("."))
	            answer = answer.substring(0,answer.length()-1);}
	        
	        if(answer.length()<=2)
	        {
	        	 
	            while(answer.length()<3)
	            {
	                answer += answer.substring(answer.length()-1,answer.length());
	               
	            }
	        }
			
	        System.out.println(answer);
	}

}
