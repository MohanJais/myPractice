package builderDesign;

public class FloodResistantBuilder implements Builder{
	
	private Home floodResistantBuilder = new Home();

	@Override
	public void buildFloor() {
		// TODO Auto-generated method stub
		this.floodResistantBuilder.floor = "10 feet above";
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		this.floodResistantBuilder.walls = "water resistance";
	}

	@Override
	public void buildTerrace() {
		// TODO Auto-generated method stub
		this.floodResistantBuilder.terrace = "watrer leakage resistant";
		
	}

	@Override
	public Home getComplexHomeObject() {
		// TODO Auto-generated method stub
		return this.floodResistantBuilder;
	}

}
