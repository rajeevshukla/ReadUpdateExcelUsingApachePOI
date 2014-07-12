
public class Widening {
	
	/*public void ab(int x){
		System.out.println("in int");
	}*/
  
	/*public void ab(Byte x){
		System.out.println("in byte");
	}*/
	/*public void ab(short x){
		System.out.println("in short");
	}*/
	/*public void ab(long x){
		System.out.println("in long");
	}*/
	/*public void ab(float x){
		System.out.println("in float");
	}*/
	
	
	
	public void ab( byte... b){
		System.out.println("in var agru. ");
	}
	
	public void ab(A a ){
		System.out.println(" in a class");
	}
	
	public void ab(Object a ){
		System.out.println(" in Object class");
	}
	
	public void ab(B a ){
		System.out.println(" in B class");
	}
	
	
	public static void main(String  ...args) {
		
		Widening wideningn=new Widening();
		wideningn.ab((byte)23);
		//wideningn.ab(232, (byte)3,(byte)4);
		
	}
	
	
	
	/**
	 *  1:- same type if not matched then go for windening.. 
	 * 
	 *    widening or autoboxing..  ?? 
	 *     widening.. 
	 *     autoboxing and var -arg ?? 
	 *     
	 *     autoboxing..
	 *    
	 *    
	 */
}
