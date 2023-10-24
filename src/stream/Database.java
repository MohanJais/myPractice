package stream;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
		public static List<Emp> getEmployees(){
			
			List<Emp> list = new ArrayList<>();
			
			list.add(new Emp(1,"Ram","CSE", 500000));
			list.add(new Emp(2,"Krishna","ECE", 1500000));
			list.add(new Emp(3,"Gaur","CE", 2500000));
			list.add(new Emp(4,"Nitai","IT", 300000));

			return list ;
			
		
			
		}
	
		
}
