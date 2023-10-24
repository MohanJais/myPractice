package sorting;

import java.util.Comparator;

public class CustomSorting {
	public static Comparator<Emp> nameComparator= new Comparator<>(){
		@Override
		public int compare(Emp o1, Emp o2) {
			return o1.getName().compareTo(o2.getName());
		}		
	};
	
	public static Comparator<Emp> ageComparator = new Comparator<>() {
		@Override
		public int compare(Emp o1, Emp o2) {
			return o1.getAge() - o2.getAge();
		}	
	};
	
	public static Comparator<Emp> salaryComparator = new Comparator<>() {
		@Override
		public int compare(Emp o1, Emp o2) {
			return o1.getSalary()-o2.getSalary();
		}
		
	};

}
