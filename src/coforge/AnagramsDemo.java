package coforge;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramsDemo {

	public static boolean checkAnagramsTest(String input1,String input2) {
				
		Map<Character, Long> input1Count = input1.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<Character, Long> input2Count = input2.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		Character result1 = input1Count.entrySet().stream().filter(entry->entry.getValue()==1L)
				.map(entry->entry.getKey()).findFirst().get();
				System.out.println(result1);

		Character result2 = input2Count.entrySet().stream()
					.filter(entry->entry.getValue()>1).map(entry->entry.getKey())
					.findFirst().get();
		System.out.println(result2);
		
		input1Count.entrySet().stream().sorted();
		input2Count.entrySet().stream().sorted();
		
		if(input1Count.equals(input2Count)) {
			return true;
			}else{
				return false;
			}
		
//		if(input1Count.size() != input1Count.size()) {
//			return false;
//		}
//		
//		return input1Count.entrySet().stream()
//				.allMatch(entry-> input2Count.containsKey(entry.getKey())	
//							&& input2Count.get(entry.getKey()).equals(entry.getValue()));
//		}
//	
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="youaregreat";
		String str2="aregreatyou";
		
		boolean checkAnagrams=checkAnagramsTest(str1,str2);
		System.out.println(checkAnagrams);
	}
}
	
	

