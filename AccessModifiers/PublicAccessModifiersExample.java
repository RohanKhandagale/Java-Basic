package Practice;

public class PublicAccessModifiersExample {

	public String name = "Rohan";

	public void publicModifiersInSameClass() {
		System.out.println(name);
	}	


	public static void main(String[] args) {
		Hot hot = new Hot();		
		hot.publicModifiersInSameClass(); //1.. public modifiers 
		//access in same class


		System.out.println(hot.name); //2.. we can access public
		//modifiers in same package

		Man man = new Man();
		man.publicModifiersInSameClass(); // 3 we can access public modifiers
		// subclass inside the package

	}

}
class Hot{ // within the same class
	public String name = "Rohan";

	public void publicModifiersInSameClass() {
		System.out.println(name);
	}

}
class Man extends  Hot{

}
