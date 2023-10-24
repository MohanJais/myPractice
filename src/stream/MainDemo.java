package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		e.setId(1);
		e.setName("Mohan");
		e.setSalary(90000);
		
		Emp e1 = new Emp(2,"Kumar", 200000);
		
		Emp e2 = new Emp(3,"Jaiswal", 30000);

		Emp e3 = new Emp(4,"Suruchi", 50000);


		List<Emp> emp = new ArrayList<Emp>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		//emp.addAll(emp);
		//emp.stream().filter(j->j).forEach(y->System.out.println(y));
		
		List<Integer> salary = emp.stream()
			.map(i->i.getSalary()*2)
			.sorted((i1,i2)->i1.compareTo(i2))
			.collect(Collectors.toList());
		//salary.forEach(x->System.out.println(x));
		System.out.println(salary);
		
		// System.out.println(emp.toString());
		
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));
		
	}

}
