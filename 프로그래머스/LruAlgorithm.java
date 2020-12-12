import java.util.*;
public class LruAlgorithm {
	
	public static void main(String[] args) {
		int cacheSize =3;
		int answer = 0;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		ArrayList<String> cache = new ArrayList<String>();
		
		if(cacheSize ==0)
		{
			answer = cities.length * 5;
		}
		for(int i=0; i<cities.length; i++)
		{
			cities[i] = cities[i].toUpperCase(); 
            if(cache.contains(cities[i])) 
            { 
                cache.remove(cities[i]);
                cache.add(cities[i]);
                answer += 1;
            }
            else { 
                if(cache.size()==cacheSize) {
                    cache.remove(0);
                    cache.add(cities[i]);
                }
                else
                    cache.add(cities[i]);
                answer += 5;
            }
		}
		
		System.out.println(answer);
		
		

	}

}
