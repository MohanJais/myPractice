package stream;

import java.util.HashMap;
import java.util.Map;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		
		//map.forEach((key,value)->System.out.println(key+ " : " + value));
		//map.entrySet().stream().forEach(o->System.out.println(o));
		
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(x->System.out.println(x));


	}

}
