package string;

public class StringMutableDemo{
public static void main(String args[]){
StringBuffer sBuffer1=new StringBuffer("Welcome");
System.out.println("Original String is ::: " + sBuffer1 + ":: having length " +
sBuffer1.length());
//using append method
sBuffer1.append(" To Propel");
System.out.println("Modified String after append is :: " + sBuffer1 + " :: having length " + sBuffer1.length());
//using reverse method
sBuffer1.reverse();
System.out.println("Modified String after Reverse is :: " + sBuffer1);
}
}