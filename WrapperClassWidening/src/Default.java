
public class Default {
	
	{
		System.out.println("init 1");
	}
	{
		System.out.println("ini 2");
	}
	
	public Default() {
		super();
		//<init>
		System.out.println("in default...");
	}
	public Default(int x){
		this();
		//no <init>
		System.out.println("In parameterized..contru...");
	}
	
	public static void main(String[] args) {
		
		new Default(2);
	}
}
