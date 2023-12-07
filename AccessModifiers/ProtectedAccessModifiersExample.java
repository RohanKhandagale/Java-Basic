package Practice;
public class ProtectedAccessModifiersExample {
	protected String name = "Rohan";

	public void protectedWithinTheSameClass() {
		System.out.println(name);
	}	

	public static void main(String[] args) {
		Meta meta = new Meta();
		meta.protectedWithinTheSameClass(); //1..Within The Same Class


		Beta beta = new Beta();
		beta.protectedWithinTheSameClass(); // 2..Subclass inside the package 


	}
}
class Meta{
	protected String name = "Rohan";

	public void protectedWithinTheSameClass() {
		System.out.println(name);
	}
}
class Beta extends Meta{


}
//class Other{
//
//public void protectedWithinTheSameClass() {
//	Other other = new Other();
//    other.protectedWithinTheSameClass();
//    System.out.println(other);
//}
//	
//}
