package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelsCount {
	public static void main(String[] args) {
		String s="Prasathsing";
		Map<Character,Integer>mp=new LinkedHashMap<Character, Integer>();
	for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				if (mp.containsKey(c)) {
					
				
				Integer integer = mp.get(c);
				mp.put(c, integer+1);
			}
			else {
				mp.put(c, 1);
			}
			}	}
	Set<Entry<Character,Integer>> entrySet = mp.entrySet();
	for (Entry<Character, Integer> entry : entrySet) {
		System.out.println(entry);		
	

	}
//System.out.println(mp);
	}}
