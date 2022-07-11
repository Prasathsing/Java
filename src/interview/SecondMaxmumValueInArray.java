package interview;

public class SecondMaxmumValueInArray {

	public static void main(String[] args) {

		int[] a= {10,20,45,50,14,29};
int first=0;
int second=0;
int third=0;
for (int i = 0; i < a.length; i++) {
	if (a[i]>first) {
		third=second;
		second=first;
		first=a[i];
		
	} else if (a[i]>second) {
		second=a[i];
	}
	else if (a[i]>third) {
		third=a[i];
	}
	}
System.out.println(third);
	}

}
