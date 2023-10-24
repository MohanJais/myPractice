package Prac1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Mohan Kumar Mohan";
		String input = "Suruchi Jaiswal Suruchi";
		findDublicate(input);
		
		Set<Character> dublicate = new HashSet<>();
		Map<Character, Integer> mapCount = new HashMap<>();
		for(int i =0; i<str.length();i++) {
			if(mapCount.containsKey(str.charAt(i))){
				mapCount.put(str.charAt(i), mapCount.get(str.charAt(i))+1);
			}else {
				mapCount.put(str.charAt(i),1);
			}
		}
		for(Map.Entry<Character, Integer> entry: mapCount.entrySet()) {
			if(entry.getValue()>1)
				dublicate.add(entry.getKey());
		}
		
		//System.out.println(dublicate);
	}

	private static void findDublicate(String input) {
		Map<Character, Long> mapCount = input.chars()
				.mapToObj(ch->(char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//mapCount.forEach((Character, Long)->{System.out.println(Character, Long)});
		
		Map<Character, Long> dublicate = mapCount.entrySet().stream()
					.filter(entry->entry.getValue()>1)
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		dublicate.forEach((Character, Fre)->{
			System.out.println("Character: "+Character + " & Frequency "+Fre );
		});
	}

}
