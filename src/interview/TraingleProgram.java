package interview;

public class TraingleProgram {
	public static void main(String[] args) {
		int a = 6;
//		 for (int i = 1; i <=a; i++) {
//		 for (int j =1; j<=i; j++) {
//		 System.out.print("* ");
//		 }
//		 System.out.println();
		// }
		//

		// left traingle

//		for (int i = 0; i < a; i++) {
//
//			for (int j = 2 * (a - i); j >= 0; j--) {
//				System.out.print(" ");
//
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i <a; i++) {
			for (int j =a-i; j>1; j--) {
				System.out.print(" ");
			}
			for (int j =0; j<=i; j++  ) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
		
	}
}
