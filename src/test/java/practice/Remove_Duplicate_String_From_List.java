package practice;

import java.util.ArrayList;
import java.util.HashSet;
public class Remove_Duplicate_String_From_List {

	public static void main(String[] args) {
		String str[] = {"Java","java","selenium","Selenium","QTP"};
		HashSet<String> set = new HashSet<String>();
		for(String word:str) {
			set.add(word.toLowerCase());
		}
		System.out.println(set);
		//***********************************
		ArrayList<String> list = new ArrayList<String>();
		for(String word:str) {
			if(!list.contains(word.toLowerCase())) {
				list.add(word.toLowerCase());
			}
			else {
				System.out.println("Duplicate: "+word);
			}
		}
		System.out.println(list);

	}

}
