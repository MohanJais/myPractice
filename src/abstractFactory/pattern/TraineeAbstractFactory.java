package abstractFactory.pattern;

public class TraineeAbstractFactory extends AbstractFactory{
	
	@Override
	public Profession getProfession(String typeOfProfession) {
		if(typeOfProfession == null) {
			return null;
		}
		if(typeOfProfession.equalsIgnoreCase("Doctor")) {
			return new TraineeDoctor();
		}
		else if(typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new TraineeEngineer();
		}
		else if(typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new TraineeTeacher();
		}
		return null;
	}

	
	

}
