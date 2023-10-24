package hashEqual;

public class Emp {

	private int id;
	private String name;
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || getClass() != obj.getClass())
		 { 
			return false; 
			}
		if(obj == this)
		{
			return true;
		}
		
		Emp emp = (Emp)obj;
		return (this.getId()==emp.getId());
	}
	
	@Override
	public int hashCode() {
		return this.getId();
	}
	
}
