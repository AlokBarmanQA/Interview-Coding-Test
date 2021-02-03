package practice;

import org.apache.commons.lang3.StringUtils;

public class Count_Specific_Duplicate_Character_StringUtils {

	public static void main(String[] args) {
		String str = "aabbccddeeffgg";
		int duplicate = StringUtils.countMatches(str, 'b');
		System.out.println(duplicate);
	}

}
