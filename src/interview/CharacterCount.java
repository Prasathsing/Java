package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
public static void main(String[] args) {
	String s="Ramesh";
	Map<Character, Integer>mp=new LinkedHashMap<Character, Integer>();
	for (int i = 0; i <s.length(); i++) {
		char c = s.charAt(i);
		if (mp.containsKey(c)) {
			Integer integer = mp.get(c);
			mp.put(c,integer+1 );
		} else {
			mp.put(c, 1);

		}
	}
	System.out.println(mp);
}
}
