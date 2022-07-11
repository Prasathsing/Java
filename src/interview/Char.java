package interview;

import java.io.ObjectOutputStream.PutField;
import java.util.LinkedHashMap;
import java.util.Map;

public class Char {
	public static void main(String[] args) {
//		String s="prasathsing";
//		Map<Character, Integer>m=new LinkedHashMap<Character, Integer>();
//		for (int i = 0; i <s.length(); i++) {
//			char c = s.charAt(i);
//			if (m.containsKey(c)) {
//				Integer count = m.get(c);
//				m.put(c, count+1);
//			} else {
//m.put(c, 1);
//			}
//		}
//	System.out.println(m);
	
	String s="java is a java program and it is a simple one";
	Map<String, Integer>m=new LinkedHashMap<>();
	String[] split = s.split(" ");
	for (int i = 0; i < split.length; i++) {
		if (m.containsKey(split[i])) {
			Integer integer = m.get(split[i]);
			m.put(split[i],integer+ 1);
		} else {
m.put(split[i], 1);
}
	}
	
	System.out.println(m);
	
	}

}
