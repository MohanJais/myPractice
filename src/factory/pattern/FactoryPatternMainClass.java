package factory.pattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession("Doctor");
		doc.print();
		
		Profession eng = professionFactory.getProfession("Engineer");
		eng.print();

		Profession tea = professionFactory.getProfession("Teacher");
		tea.print();

	}

}
