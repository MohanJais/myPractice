package sorting;


public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private int age;
	private int salary;
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Emp(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Emp o) {
		return this.id-o.id;
	}
	
//	public static Comparator<Emp> nameComparator = new Comparator<>() {
//		@Override
//		public int compare(Emp e1, Emp e2) {
//			return e1.getName().compareTo(e2.getName());
//		}	
//	};
//	
//	public static Comparator<Emp> ageComparator = new Comparator<>() {
//
//		@Override
//		public int compare(Emp o1, Emp o2) {
//			return 0;
//		}
//		
//	};
}
