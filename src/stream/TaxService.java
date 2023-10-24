package stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaxService {
	
	public static List<Emp> taxEmp(String input){
		
		if(input.equalsIgnoreCase("tax")) 
			return	Database.getEmployees().stream().filter(t->t.getSalary()>500000).collect(Collectors.toList());
		else 
			return	Database.getEmployees().stream().filter(t->t.getSalary()<=500000).collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(taxEmp("Non tax"));
		List<Emp> emp = Database.getEmployees();
		
		//Collections.sort(emp, (o1,o2)->o2.getSalary()-o1.getSalary());
		//Collections.sort(emp, nameComparator());
		//emp.stream().sorted().forEach(x->System.out.println(x));
		//emp.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).forEach(x->System.out.println(x));

		//emp.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
		
		//emp.stream().sorted(Comparator.comparing(emp->emp.getSalary)).forEach(x->System.out.println(x));
		emp.stream().sorted(Comparator.comparing(Emp::getDept)).forEach(System.out::println);
		
		int totalSum = ((Stream<Emp>) Database.getEmployees()).map(Emp->Emp.getSalary()).reduce(0,Integer::sum);

		

		//System.out.println(emp);
	}

	private static Comparator nameComparator() {
		// TODO Auto-generated method stub
		return null;
	}

}
