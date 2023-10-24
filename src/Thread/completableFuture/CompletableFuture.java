package Thread.completableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFuture {
	
	
	public static void main(String[] args) {
		
		ExecutorService cpuBound = Executors.newFixedThreadPool(4);
		ExecutorService ioBound = Executors.newCachedThreadPool();
		
		CompletableFuture.supplyAsync(()->getOrderTask(),ioBound)
				.thenApplyAsync(order->enrichOrder(order),cpuBound)
				.thenApply(order->performPayment(order))
				.thenApply(order->dispatchTask(order))
				.thenApply(order-sendMailTask(order));
				
		
		//ExecutorService service = Executors.newFixedThreadPool(10);
		
		
//		try {
//			Future<Order> future1 = (Future<Order>) service.submit(getOrderTask());
//			Order order = future1.get();
//			
//			Future<Order> future2 = service.submit(enrichOrder(order));
//			order = future2.get();
//			
//			Future<Order> future3 = service.submit(performPayment(order));
//			order = future3.get();
//			
//			Future<Order> future4 = service.submit(dispatchTask(order));
//			order = future4.get();
//			
//			Future<Order> future5 = service.submit(sendEmail(order));
//			order = future5.get();
//		} catch( InterruptedException | ExecutionException e) {
//			e.printStackTrace();
//		}
		
		
	}

}
