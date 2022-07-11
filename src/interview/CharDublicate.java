package interview;

public class CharDublicate {
	public static void main(String[] args) {
		String s="Prasathsing";
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			int count=1;
			for (int j = i+1; j < cs.length; j++) {
				if (cs[i]==cs[j]&&cs[i]!=' ') {
					count++;
					cs[j]='1';
				}
			}
			if (count>1&&cs[i]!='1') {
				System.out.println(cs[i]);
			}
		}
	}

}
