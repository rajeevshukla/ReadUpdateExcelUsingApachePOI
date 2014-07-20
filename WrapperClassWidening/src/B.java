
public class B extends A {

	//hierarchy  concepts     order.. lowest   class match first if doest found then tris to go in upper class
	
	public void ab(A a){
		
		System.out.println("in a class");
	}
	/*public void ab(B b){
		System.out.println("in b class");
	}
	*/
	public void ab(Object obj) {
		System.out.println("in object method..");
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.ab(new B());
	}
}
