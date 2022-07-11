package interview;

public class CharacterDublicate {
	public static void main(String[] args) {
		String s="java";
		char[] cs = s.toCharArray();
		for (int i= 0; i < cs.length; i++) {
			int count=1;
			for (int j = i+1; j < cs.length; j++) {
				if (cs[i]==cs[j]) {
					count++;
					
				}
			}
		
		if (count>1) {
			System.out.println(cs[i]);
		}
		}
		
	
	}

}
