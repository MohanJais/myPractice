package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sortMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		
		map.put(3, "c");
		map.put(0, "d");
		map.put(1, "a");
		map.put(2, "b");
		
		//List<Integer, String> list = new ArrayList<>();
		/*
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		Collections.sort(entries, new Comparator<Entry<Integer, String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		
		
		Collections.sort(entries, (o1,o2) -> o1.getKey().compareTo(o2.getKey()));
		
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		*/
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
