package sorting;

import java.util.Arrays;
import java.util.List;

import stream.NameComparator;

public class SortingMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = {3,7,2,1};
		Arrays.sort(intArr);
		//System.out.println(Arrays.toString(intArr));
	

	Emp[] empArr = new Emp[4];
	empArr[0] = new Emp(3,"Mohan", 24, 300000);
	empArr[1] = new Emp(7,"Kumar", 21, 40000);
	empArr[2] = new Emp(2,"Jaiswal", 10, 100000);
	empArr[3] = new Emp(1, "Suruchi", 27, 5000);
	
	List<Emp> eArr = Arrays.asList(
			new Emp(3,"Mohan", 24, 300000),
			new Emp(7,"Kumar", 21, 40000),
			new Emp(2,"Jaiswal", 10, 100000),
			new Emp(1, "Suruchi", 27, 5000)	
			);

	Arrays.sort(empArr);
	//System.out.println(Arrays.toString(empArr));
	
	Arrays.sort(empArr, CustomSorting.nameComparator);
	//System.out.println(Arrays.toString(empArr));
	
	Arrays.sort(empArr, CustomSorting.ageComparator); 
	//System.out.println(Arrays.toString(empArr));

	Arrays.sort(empArr, CustomSorting.salaryComparator);
	//System.out.println(Arrays.toString(empArr));
	
	//eArr.stream().filter(e->e.getAge()>20).map(Emp::getName).forEach(e->System.out.println(e));
	//eArr.stream().filter(e->e.getAge()>20).map(Emp::getSalary).forEach(e->System.out.println(e));
	double sumSalary = eArr.stream().mapToDouble(Emp::getSalary).sum();
	double avgSalary = eArr.stream().mapToDouble(Emp::getSalary).average().orElse(0.0);

	System.out.println(sumSalary);
	System.out.println(avgSalary);

	}
}
