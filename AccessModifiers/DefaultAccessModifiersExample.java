package Practice;

public class DefaultAccessModifiersExample {

	String name = "Rohan";
	public void data() {
		System.out.println(name);
	}

	public static void main(String[] args) {

		DefaultWithinheSameClass non = new DefaultWithinheSameClass();
		non.data();       // default in same class

		SubclassInsideThePackage bom = new SubclassInsideThePackage();
		bom.data(); // default subclass inside the pckage 
	}
}
class DefaultWithinheSameClass{
	String name = "Rohan";
	public void data() {
		System.out.println(name);
	}
}

//class Sample2{
//	public void callsample1Method() {
//		DefaultWithinheSameClass sample = new DefaultWithinheSameClass();
//		sample.data();
//		// sample.setname(); // private modifier can't be access from another class cuz its private
//
//	}
//}
class SubclassInsideThePackage extends DefaultWithinheSameClass{

}
