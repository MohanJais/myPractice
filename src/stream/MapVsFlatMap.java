package stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	 
	public static void main(String[] args) {
		
		List<Customer> customers = EkartDataBase.getAll();
		
		List<String> emails = customers.stream().map(Customer->Customer.getEmail()).collect(Collectors.toList());
				//System.out.println(emails);
				
		//List<List<String>> phoneNum = customers.stream().map(Customer->Customer.getPhoneNumbers()).collect(Collectors.toList());
		List<String> phoneNum = customers.stream().flatMap(Customer->Customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		
		System.out.println(phoneNum);
		
	}

}
 