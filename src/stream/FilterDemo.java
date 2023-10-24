package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		
		// arList.stream().filter(i->i>25);
		
		//arList.stream().filter(i->i%2==0).forEach(x-> System.out.println(x));
		arList.stream().filter(i->i%2==0).forEach(t->System.out.println(t));


	}

}
