package prototype.pattern;

public class ProtoTypePatternMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessionCache.loadProfessionCache();
		
		
		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
		
		Profession engProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engProfession);

		Profession teaProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teaProfession);
		
		Profession docProfession2 = ProfessionCache.getCloneNewProfession(2);
		System.out.println(docProfession2);

	}

}
