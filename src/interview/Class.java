package interview;

public class Class {
	public static void main(String[] args) {
		int a[]= {10,8,6,25,18,23};
//		int first=0;
//		int second=0;
//		int third=0;
//		for (int i = 0; i < a.length; i++) {
//		if(a[i]>first) {
//			
//			second=first;
//			third=second;
//			first=a[i];
//			
//		}
//		else if (a[i]>second) {
//			second=a[i];
//		}
//		else if (a[i]>third) {
//			third=a[i];
//		}
//		}
//			
//		System.out.println(third);
		int first=a[0];
		int second=0;
	for (int i = 1; i < a.length; i++) {
			
		if (a[i]<first) {
			second=first;
			first=a[i];
		}
		else if (a[i]<second) {
			second=a[i];
		}
		
	}
	System.out.println(second);
	}
	}



