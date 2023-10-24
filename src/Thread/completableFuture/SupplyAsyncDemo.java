package Thread.completableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SupplyAsyncDemo {
	
	
	public static List<Employee> getEmployees(){
		
		CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture.supplyAsync(()-> {
			System.out.println("Executed by : "+Thread.currentThread().getName());
			
		});
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
