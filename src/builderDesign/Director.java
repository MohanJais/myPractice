package builderDesign;

public class Director {
	
	private Builder builder;

	public Director(Builder builderType) {
		// TODO Auto-generated constructor stub
		this.builder = builderType;
	}
	
	public Home getComplexHomeOfObject() {
		return this.builder.getComplexHomeObject();
	}
	public void manageRequiredHomeConstructor() {
		// TODO Auto-generated method stub
		this.builder.buildFloor();
		this.builder.buildTerrace();
		this.builder.buildWalls();
	}

}
