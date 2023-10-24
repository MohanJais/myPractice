package hashEqual;

public class MainHashEqual {

	public static void main(String[] args) {

		Emp e1 = new Emp();
		e1.setId(1);
		e1.setName("John");
		
		Emp e2 = new Emp();
		e2.setId(1);
		e2.setName("John");
		
		System.out.println("Sallow compare : "+ (e1==e2));
		
		System.out.println("Deep compare : "+ (e1.equals(e2)));
	}

}
