package Thread.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class completableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<List<Integer>> future =service.submit(()->{
			System.out.println("Thread : " + Thread.currentThread().getName());
			//delay(1);
			//System.out.println(10/0);
			return Arrays.asList(1,2,3,4);
		});
		
		/*
		Future<List<Integer>> future1 =service.submit(()->{
			System.out.println("Thread : " + Thread.currentThread().getName());
			return Arrays.asList(1,2,3,4);
		});
		
		Future<List<Integer>> future2 =service.submit(()->{
			System.out.println("Thread : " + Thread.currentThread().getName());
			return Arrays.asList(1,2,3,4);
		});
		*/
		
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		completableFuture.get();
		completableFuture.complete("dummy data");
		
		List<Integer> list = future.get();
		//future1.get();
		//future2.get();
		System.out.println(list);
	}
	
	public static void delay(int min) {
		
			try {
				TimeUnit.MINUTES.sleep(min);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
