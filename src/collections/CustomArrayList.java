package collections;

import java.awt.List;
import java.util.ArrayList;

public class CustomArrayList extends ArrayList{
	
	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		if(this.contains(e))
			return true; 
		else
			return super.add(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomArrayList customArrayList = new CustomArrayList();
		
		customArrayList.add(1);
		customArrayList.add(1);
		customArrayList.add(2);
		customArrayList.add(1);
		
		System.out.println(customArrayList);
		
		

	}

}
