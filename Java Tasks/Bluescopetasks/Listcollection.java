package Bluescopetasks;
import java.util.*;

public class Listcollection {

	public static void main(String[] args) {
		
		String s = "Hi, This is hashmap".toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		System.out.print("Unique characters : ");
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey()+" ");
			}
		}
		
		
		 
		
		
		
		
		
		
//		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,7));
//		System.out.print("The array is ");
//		for(int l:list){
//			System.out.print(l+" ");
//		}
	}
 
	
}
