package con.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
//		int a = 1;
//		int b = 0;
//		int c = -1;
//		
//		int x = (int) ((-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a);
//		int y = (int) ((-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a);
//		System.out.println("x"+x);
//		System.out.println("y"+y);
		
//		int num = 17; 
//		int length = 7;
//		
//		int[] resultArr = new int[length];
//		
//		for(int i=1;i<length;i++){
//			resultArr[i-1] = num*i;
//		}
//		resultArr[length-1] = num*length;
//		
//		System.out.println(Arrays.toString(resultArr));
		
		
//		getValues({ "a": "1", "b": "2", "c": "3" } )
//		➞ ["1", "2", "3"]
//
//		getValues({ "a": "Apple", "b": "Microsoft", "c": "Google" })
//		➞ ["Apple", "Microsoft", "Google"]
//
//		getValues({ "key1": "true", "key2": "false", "key3": "undefined" })
//		➞ ["true", "false", "undefined"]

		Map<String,String> dict = new TreeMap<>();
		dict.put("a", "Apple");
		dict.put("c", "Google");
		dict.put("b", "Microsoft");
		dict.put("d", "CGI");
		Map<String,String> dict1 = new TreeMap<>(dict);
		int i=0;
		String[] arr = new String[dict1.size()];
		for(Map.Entry<String, String> entry : dict1.entrySet()) {
			String value = entry.getValue();
				arr[i] = value;
				i++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
//		int nums[] = {1,1,2};
//		int arr[] = new int[nums.length];
//		Set<Integer> set = new HashSet<>();
//
//		int j=0;
//		for(int i=0;i<nums.length;i++) {
//			if(!set.contains(nums[i])) {
//				set.add(nums[i]);
//				arr[j] = nums[i];
//				j++;
//			}
//		}
//		
//		nums = Arrays.copyOf(arr, arr.length);
//		
//		//System.arraycopy(nums, 0, arr, 0, nums.length);
//		
//		
//		System.out.println(Arrays.toString(nums));
//		System.out.println(set.size());


	}


}
