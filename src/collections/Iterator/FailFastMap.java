package collections.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new ConcurrentHashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			
			Integer key = it.next();
			System.out.println(key);

			//System.out.println(map);
			
		map.put(3, "c");
			
		}
		
	}

}



	
}