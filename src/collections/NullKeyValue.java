package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NullKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<Integer, String> map = new HashMap<>();

		Map<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(null, null);
		
		System.out.println(map);
		

	}

}
