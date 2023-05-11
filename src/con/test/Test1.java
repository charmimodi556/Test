package con.test;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s = "dhaval";
		char ch = 'a';
		
		String result = replace(s, ch); 
		System.out.println(result);
		
	}
	
	public static String replace(String str, char ch) {
		
		String s = String.valueOf(ch);
		str = str.replaceAll(s, "n");
		
		
		return str;
	}

}
