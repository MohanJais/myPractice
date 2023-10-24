package Optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer(101, "john", "null", Arrays.asList("397937955", "21654725"));
				
		
		//Optional<Object> emptyOptional = Optional.empty();
		//System.out.println(emptyOptional);
		
		// Optional<String> emailOptional = Optional.of(customer.getEmail());
		// System.out.println(emailOptional);
		
		//Optional<String> emailNull = Optional.ofNullable(customer.getEmail());
		//System.out.println(emailNull);
		//System.out.println(emailNullable.get());
		//System.out.println(emailNullable.orElse("default@gmail.com"));
		//System.out.println(emailNullable.orElseThrow(()->new IllegalArgumentException("email not found")));

		//EkartDataBase.getAll().stream().map(Customer::getPhoneNumbers).forEach(System.out::println);
		EkartDataBase.getAll().sort(Comparator.comparing(Customer::getId).thenComparing(Customer::getName));
//		for(Customer c :EkartDataBase.getAll()) {
//			//System.out.println("Id:  "+c.getId()+ "name: "+c.getName());
//		} 
		//int sumId = EkartDataBase.getAll().stream().filter(c->c.getId>100).map(Customer::getId).forEach(System.out::println);;;

		//EkartDataBase.getAll().stream().filter(c->c.getId()>100).map(Customer::getId).forEach(System.out::println);
		//System.out.println(sumId);
		
		int sumId =EkartDataBase.getAll().stream().map(Customer::getId).reduce(0, Integer::sum);
		System.out.println(sumId);

		
	}

}
