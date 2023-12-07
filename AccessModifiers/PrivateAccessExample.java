package Practice;

public class PrivateAccessExample {
public static void main(String[] args) {
	
	PrivateWithinTheClass don = new PrivateWithinTheClass();
	don.Dede();//private modifiers access with in the same class
	
	PrivateSubclassInsideThePackage nora = new PrivateSubclassInsideThePackage();
	nora.Dede();
}
}
class PrivateWithinTheClass{
	private String name = "Rohan";
	
	public void Dede() {
		System.out.println(name);
	}
}
class PrivateSubclassInsideThePackage extends PrivateWithinTheClass{
	
}