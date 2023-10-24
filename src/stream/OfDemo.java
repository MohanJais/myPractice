package stream;

import java.util.stream.Stream;

public class OfDemo {
	
	public static void main(String[] args) {
		
		Stream.of(1,11,111,1111).forEach(x->System.out.println(x));
		
		String[] name = {"code","Decode", "Am", "Im"};
		Stream.of(name).filter(x->x.length()>2).forEach(x->System.out.println(x));
		}
	
	}

