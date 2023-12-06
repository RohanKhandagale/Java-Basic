package ArrayExamples;



import java.util.Arrays;
import java.util.List;

public class ConvertStringArrayToArrayList {
	public static void main(String[] args) {
		
//		  For Converting String To ArrayList

		String[] name = {"Aziz","Rohan","Rabbul","Kunal"}; 
		List<String> strList = Arrays.asList(name); 
	    strList.forEach(str -> System.out.println(" "+ str));
	    
		
		 
		/*
		 * For Converting Float To array List
		 
		Float[] number = {11.1f,12.2f,34.5f};
		List<Float> FloatList = Arrays.asList(number);
		FloatList.forEach(data -> System.out.println(" "+ data));
		*/
		
		/*
		Integer[] number = {1,2,3,4,5,6};  for int use Integer full word
		List<Integer> intList = Arrays.asList(number); Integer
		// For Display ArrayList This Syntax is used
		intList.forEach(data -> System.out.println(" " + data)); Integer
		*/
	}

}
