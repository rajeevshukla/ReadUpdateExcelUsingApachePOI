
public class EqualsToEx {

	public static void main(String[] args) {
		//Wrapper class objects are immutable..
		Integer integer=new Integer(12);
		Integer integer2=new Integer(12);
		/*System.out.println(integer==integer2); //false
		System.out.println(integer.equals(integer2)); //true
		*/
		Integer integer3=13;  // by default range withing 127 (byte range)
		Integer integer4=13;
		Integer integer5=13;
		
		System.out.println(integer3 == integer4); //true  (same referenc will be assigned withing 127)
		System.out.println(integer3.equals(integer4)); //true
		
		
	}
	
	
}
