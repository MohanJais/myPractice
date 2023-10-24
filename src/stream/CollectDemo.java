package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(35);
		arList.add(25);
		arList.add(52);
		
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(250);
		arrList.add(52);
		
		//System.out.println(arList);
		//System.out.println(arrList);
		
		Stream<Integer> openStream = arList.stream();
		Stream<Integer> filterStream = openStream.filter(i->i>2);

		List<Integer> newList = filterStream.collect(Collectors.toList());
		//System.out.println(newList);
		//newList.stream().forEach(x-> System.out.println(x));
		
		Stream<Integer> sortedStream = arrList.stream().sorted();
		sortedStream.forEach(x-> System.out.println(x));
		/*
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.addAll(arList);
		arrayList.addAll(arrList);
		
		System.out.println(arrayList);

		
		
		// arList.stream().filter(i->i>25);
		
		arList.stream().map(i->i*i)
		.forEach(x-> System.out.println(x));
		
		arrList.stream().map(i->i>500)
		.forEach(x-> System.out.println(x));
		
		arrayList.stream().map(i->i*i<500)
		.forEach(x-> System.out.println(x));
	*/
	}

}
