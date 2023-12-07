package Practice;

public class AccessmodifiresExample {
	
	private String name;
	private void setname() {
		this.name = "Xyz";
		System.out.println(name);
	}
	public void callInternalMethodOutsidePackage() { // for accessing  private modifire we create a public method then we access it 
		this.setname();
		//		setname();
	}
	
	
	public static void main(String[]args) {
		Sample sample = new Sample();
		//	sample.setname();  //Cannot be accessed because access modifier is private 
		sample.callInternalMethod(); //first way to access the method in other class
		
		
	// second way to access
		
		Sample2 sample2 = new Sample2();
		sample2.callsample1Method();
		
		 
		
		Sample3 sample3 = new Sample3();
		sample3.callInternalMethod();
//		sample3.setname();   // we can't access the private modifiers function inside subclass.
		sample3.callMethodUsingSuperKeyword();
	}
}
class Sample{
	private String name;
	private void setname() {
		this.name = "Xyz";
		System.out.println(name);
	}
	public void callInternalMethod() { // for accessing  private modifire we create a public method then we access it 
		this.setname();
		//		setname();
	}

}

class Sample2{
	public void callsample1Method() {
		Sample sample = new Sample();
		sample.callInternalMethod();
		// sample.setname(); // private modifier can't be access from another class cuz its private

	}
}

class Sample3 extends Sample{
	public void callMethodUsingSuperKeyword() {
//		super.name = "Amb";
		super.callInternalMethod();
	}
}
