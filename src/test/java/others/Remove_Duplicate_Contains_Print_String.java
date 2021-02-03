package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Duplicate_Contains_Print_String {

	public static void main(String[] args) {
		int[] myArray = {0,1,2,2,1,3,3,4,4,5};
		System.out.println(Arrays.toString(myArray));
		List <Integer> arrayList = new ArrayList<Integer>();
		
		for (Integer number:myArray) {
			if (!arrayList.contains(number)) {
				arrayList.add(number);
			}
		}
		System.out.println(arrayList);
		for (Integer num : arrayList) {
			System.out.print(num+" ,");
		}
		System.out.println();
		System.out.println("**********************************");
		String[] employees = {"Alok", "Kumar", "Barman", "Kumar"};
		System.out.println(Arrays.toString(employees));
		List <String> employeeList = new ArrayList<String>();
		for (String empName : employees) {
			if (!employeeList.contains(empName)) {
				employeeList.add(empName);
			}
		}
		System.out.println(employeeList);
		for (String name:employeeList) {
			System.out.println(name);
		}
	}
}
