package com.prodapt.assesment;
import java.util.Scanner; 

public class SchoolRecords {
	
	static void displayRecord (String printValue, int i){
		if (i == 1) {
			System.out.println("School Id was "+printValue);
		} else if (i == 0) {
			System.out.println("School Name was " + printValue);
		}else {
			System.out.println("School Addres was " + printValue);
		}
	}

	static String addRecord(int value) {
		Scanner input = new Scanner(System.in);
		
		if (value == 1) {
			System.out.println("Enter a school id");
			String sId = input.nextLine();
			return sId;
		} else if (value == 0) {
			System.out.println("Enter the school name");
			String sName = input.nextLine();
			return sName;
		}else {
			System.out.println("Enter the school address");
			String sAddress = input.nextLine();
			return sAddress;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String schoolName;
		int schoolId;
		String schoolAddress;	
		
		for (int i=0; i<3; i++) {
			String valCatch = addRecord(i);
			displayRecord(valCatch, i);
		}
	}
}