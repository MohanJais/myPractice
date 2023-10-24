package Thread;

public class DisPrint {
	
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Good morning : "+name);
			
		}
	}
	
	
}
