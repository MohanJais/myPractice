package abstractFactory.pattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
		
		Profession doc = abstractFactory.getProfession("Doctor");
		doc.print();
		
		Profession eng = abstractFactory.getProfession("Engineer");
		eng.print();

		Profession tea = abstractFactory.getProfession("Teacher");
		tea.print();

	}

}
