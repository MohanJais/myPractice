package collections.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends Thread{
	
	static Map<Integer, String> map = new ConcurrentHashMap<>();
	
	@Override
	public void run() {
		//Thread.sleep(1000);
		map.put(104, "E");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		map.put(100,"A");
		map.put(101,"B");
		map.put(102,"C");
		
		CustomThread customThread = new CustomThread();
		customThread.start();

		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key);
			//Thread.sleep(1000);
			map.put(103, "D");
		}
		
		for(Object o: map.entrySet()) {
			System.out.println(o);
			
		}
		
		System.out.println(map);
		
	}

}
