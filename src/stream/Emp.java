package stream;


public class Emp implements Comparable<Emp> {
	
	
	private int id;
	private String name;
	private String dept;
	private int salary;
	
	
	
	public Emp(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
