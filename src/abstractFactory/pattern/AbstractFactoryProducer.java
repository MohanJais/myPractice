package abstractFactory.pattern;

public class AbstractFactoryProducer {
	
	public static AbstractFactory getProfession(boolean isTrainee) {
		if(isTrainee) {
			return new TraineeAbstractFactory();
		}
		else {
			return new ProfessionAbstractFactory();
		}
	}

}
