package builderDesign;

public class EarthQuakeResistantBuilder implements Builder{
	
	private Home earthQuakeResistantBuilder = new Home();

	@Override
	public void buildFloor() {
		// TODO Auto-generated method stub
		this.earthQuakeResistantBuilder.floor = "Wooden floor";
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		this.earthQuakeResistantBuilder.walls = "Wooden walls";
	}

	@Override
	public void buildTerrace() {
		// TODO Auto-generated method stub
		this.earthQuakeResistantBuilder.terrace = "wooden terrace";

	}

	@Override
	public Home getComplexHomeObject() {
		// TODO Auto-generated method stub
		return this.earthQuakeResistantBuilder;
	}

}
