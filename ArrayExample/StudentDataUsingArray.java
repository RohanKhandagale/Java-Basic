package ArrayExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDataUsingArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size you want for array:");
		int size = Integer.parseInt(br.readLine());
		Student[] std = new Student[size];


		int marks = 0;
		int rollNo = 0;
		String name = "";

		for(int i=0; i<std.length; i++) {
			System.out.println("Enter Name:");
			name = br.readLine();

			System.out.println("Enter Roll no:");
			rollNo = Integer.parseInt(br.readLine());

			System.out.println("Enter Marks:");
			marks = Integer.parseInt(br.readLine());

			std[i] = new Student();
			std[i].setName(name);
			std[i].setMarks(marks);
			std[i].setRollNo(rollNo);
			std[i].setPercent(marks);
		}
		System.out.println("=======================================");
		System.out.println("-------------Student Details-----------");
		System.out.println("=======================================");

		for(int i=0; i<std.length; i++)
		{
			System.out.println("-----------Stduent: " + i +" Data--------------");
			System.out.println("Name:" +std[i].getName());
			System.out.println("RollNo:" +std[i].getRollNo());
			System.out.println("Mark:" +std[i].getMarks());
			System.out.println("Percent:" +std[i].getPercenT());
		}
	}
}