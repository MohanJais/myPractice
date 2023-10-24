package stream;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(25);
		arrList.add(52);
		
		System.out.println(arList);
		System.out.println(arrList.size());

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

	}

}
