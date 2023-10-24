package lamda;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String>{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		
		return "Hare Krishna";
		}
	//() -> "HK";
	/*
	public String get(String s) {
		// TODO Auto-generated method stub
		
		return "Hare Krishna Hare Ram";
		}	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SupplierDemo supplier = new SupplierDemo();
		//Supplier<String> supplier = new SupplierDemo();
		Supplier<String> supplier = ()->"HK";

		System.out.println(supplier.get());
		//System.out.println( supplier.get("Hit"));


	}

}
