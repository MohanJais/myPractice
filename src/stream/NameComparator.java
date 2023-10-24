package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Stream<Emp> empStream= Database.getEmployees().stream().sorted((o1,o2)->(int)(o1.getName() - o2.getName()).collect(Collectors.toList()));
	}

}
