package con.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		

//		Find the longest common prefix string amongst an array of strings. 
//		If there is no common prefix, return nothing.   
//		 
//		Input: strs = ["caterpillar","cant","cat"] 
//		 
//		Output: "ca" 
//		 
//		Input: strs = ["dog","racecar","car"] 
//		 
//		Output: "" 
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		String s = longCommonPrefix(list);
		System.out.println(s);
	}
	
	public static String longCommonPrefix(List<String> list){
		
		String s = null;
		
		for(int i=1;i<list.size()-1;i++) {
			s = compareCommon(list.get(i), list.get(i+1));
		}
		
		return s;
	}
	
	public static String compareCommon(String s1, String s2) {
		
		int min = Math.min(s1.length(), s2.length());
		String resultString = "";
		
		for(int i=0;i<min;i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				resultString = resultString + s1.charAt(i);
			}
		}
		
		
		return resultString;
	}

}
