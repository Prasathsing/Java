package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCount {
public static void main(String[] args) {
	String s="Java is simple and Easy is Easy";
	String[] split = s.split(" ");
	Map<String,Integer>mp=new LinkedHashMap<String, Integer>();
	for (String string : split) {
		if (mp.containsKey(string)) {
			Integer integer = mp.get(string);
			mp.put(string, integer+1);
			
		}else {
			mp.put(string, 1);
		}
	}
	System.out.println(mp);
	
}
}
