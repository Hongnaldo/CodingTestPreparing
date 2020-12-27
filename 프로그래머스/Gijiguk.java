<<<<<<< HEAD
import java.util.*;
public class Gijiguk {

	public static void main(String[] args) {
		int n =16;
		int[] stations = {9};
		int w = 2;
		int answer=0;
	
		
		
		int i=0;
		int start =1;
		while(start<=n)
		{
			
			if(i<stations.length && start >= stations[i]-w)
			{
				start= stations[i] + w+1;
				i++;
				
			}
			else
			{
				start = start+ w*2 +1;
				answer++;
			}
			
		}
		System.out.println(answer);
	}

}
=======
import java.util.*;
public class Gijiguk {

	public static void main(String[] args) {
		int n =16;
		int[] stations = {9};
		int w = 2;
		int answer=0;
	
		
		
		int i=0;
		int start =1;
		while(start<=n)
		{
			
			if(i<stations.length && start >= stations[i]-w)
			{
				start= stations[i] + w+1;
				i++;
				
			}
			else
			{
				start = start+ w*2 +1;
				answer++;
			}
			
		}
		System.out.println(answer);
	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
