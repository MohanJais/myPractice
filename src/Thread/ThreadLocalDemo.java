package Thread;

import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

public class ThreadDateSafeFormat{
	
	public static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-mm-dd"));
	
//	public static ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<>() {
//		@Override
//		SimpleDateFormat initialValue() {
//			return new SimpleDateFormat("yyyy-mm-dd");
//		}
//		
//		@Override
//		SimpleDataFormat get() {
//			return super.get();
//		}
//	}
}

public class ThreadLocalDemo {
	
//	private static ExecutorService threadPool = new Executors.newFixedThreadPool(10);
//	private static SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD");

	
	public static void main(String[] args) {
		
		
	public String birthDate(int userId) {
			
			Date birthDate = birthDateFromDb(userId);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			return df.format(birthDate);
		}
		
//		for(int i =0; i<1000;i++) {
//			int id =i;
//			threadPool.submit(()->{
//				String birthDate = new UserService().birthDate(id);
//				System.out.println(birthDate);
//				});
//			}
//		}
		
		
//		for(int i=0;i<1000;i++) {
//			int id =i;
//			new Thread(()->{
//				String birthDate = new UserService().birthDate(id);
//				System.out.println(birthDate);
//			}).start();
//			
//			Thread.sleep(1000);
//			
//		}
		
	
//			new Thread( () ->{
//				
//				String birthdate = new UserService().birthDate(100);
//				System.out.println(birthdate);
//			}).start();
//			
//			new Thread( ()->{
//				String birthDate = new UserService().birthDate(10);
//				System.out.println(birthDate);
//			}).start();
//			Thread.sleep(1000);
//		}
	

}
