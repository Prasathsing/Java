package interview;

public class StringDublicate {
public static void main(String[] args) {
	String s="Java is a Java and simple is  ";
	String[] split = s.split(" ");
	for (int i = 0; i < split.length; i++) {
		int count=1;
		for (int j = i+1; j < split.length; j++) {
			if (split[i].equalsIgnoreCase(split[j])) {
				count++;
			}
		}
	if (count>1) {
		System.out.println(split[i]);
	}
	}
}
}
