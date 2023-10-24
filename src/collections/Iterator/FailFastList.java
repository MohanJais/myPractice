package collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
			
			list.add("c");
			
			
		}
		

	}

}
