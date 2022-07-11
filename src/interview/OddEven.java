package interview;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
//		System.out.println("Enter the Number");
//		Scanner s=new Scanner(System.in);
//		 int a=s.nextInt();

// ====>> Finding given number is odd or even

//		{
//       
//        if (a%2==0) {
//			System.out.println(a+": is Even Number");
//		}
//        else {
//			System.out.println(a+": is Odd Number");
//		}
//		}
	
	
// ====>> Printing even Number
//          
//		    for (int i = 0; i <= a; i++) {
//	        if (i%2==0) {
//		    System.out.println(i);
//	        }
//          }	
	
	
	
// ====>> Printing odd Number
          
//		    for (int i = 0; i <= a; i++) {
//			if (i%2!=0) {
//		    System.out.println(i);	
		 
//			}
//		    }	
		 
		 
		 
// ====>> count of odd number
		 
//		  int count=0;
//	      for (int i = 0; i <=a; i++) {
//	   	  if (i%2!=0) {
//			count++;
//			System.out.println(i);
//		  }
//	      }
//	      System.out.println("Total count is :"+count);
	      
// ====>> count of even Number
 
//		 int count=0;
//	 	 for (int i = 0; i <=a; i++) {
//		 if (i%2==0) {
//		 count++;
//		 System.out.println(i);
//		 }
//		 }
//		 System.out.println("Total even count is :"+count);
	
	
// ====>> print sum of even number
//	     int sum=0;
//		 for (int i = 0; i <=a; i++) {
//		 if (i%2==0) {
//		 sum+=i;
//		 }
//		 }
//		 System.out.println(sum);
		 
// ====>> print sum of odd number
//	     
//		 int sum=0;
//	     for (int i = 0; i <=a; i++) {
//		 if (i%2!=0) {
//		 sum+=i;
//		 }
//	     }
//	     System.out.println(sum);
	
// ====>> Print sum of number
//	    int sum=0;
//	    for (int i = 0; i <=a; i++) {
//		sum+=i;
//	    }
//	    System.out.println(sum);
	
// ====>> Reverse printing the Number

//	   int rev=0;
//	   while (a>0) {
//	   int n=a%10;
//	   rev=(rev*10)+n;
//	   a/=10;
//	   }
//	   System.out.println(rev);
	
// ====>> Palindrome
	  
//	   int rev=0;
//	   int b=a;
//	   while (a>0) {
//	   int n=a%10;
//	   rev=(rev*10)+n;
//	   a/=10;
//	   }
//	   if (b==rev) {
//	   System.out.println("Palindrome");
//	   } else {
//	   System.out.println("Not a Palindrome");
//	   }		
//     Count Number of Digits
	
// ====>> Finding the Count of Number
//	   int count=0;
//	   while (a>0) {
//	   count++;
//	   a/=10;
//	   }
//	   System.out.println("total Digits is : "+count);
	
// ====>> Factorial
//	  int fact=1;
//	  while (a>0) {
//	  fact=fact*a;
//	  a=a-1;
//	  }
//	  System.out.println(fact);
	
// ====>> Prime Number
//		int count=0;
//		int a=19;
//		for (int i = 2; i <=a/2; i++) {
//		if (a%i==0) {
//		count++;		
//		System.out.println(i);
//		}
//		}
//	    if (count==0) {
//		System.out.println("Prime Number");
//    	}
//	    else {
//		System.out.println("Not a prime Number");
//	    }
//	    System.out.println(count);
//	    }
		 
		
// ====>> String reverse printing
//		 String s1="Ramesh";
//		 String s2="";
//		 String s3=s1;
//		 for (int i =s1.length()-1; i>=0; i--) {
//		 char charAt = s1.charAt(i);
//		 s2=s2+charAt;
//		 }
//		 System.out.println(s2);
//	     if (s2.equals(s3)) {
//		 System.out.println("palindrome");
//	     } else {
//         System.out.println("not a palindrome");
//	     }
	

// ====>> String split

//		String s="ramesh.,prakash.,udhaya.,prithivi";
//		String[] split = s.split(".,");
//		int length = split.length;
//		for (int i = 0; i <length; i++) {
//	
//		System.out.println(split[i]);
//		}
//=====>>>>=======
// ====>> count of vowels
		String s="welcome to java class today";	
		char[] charArray = s.toCharArray();
	    int count=0;
		for (int i = 0; i < charArray.length; i++) {
		char c=charArray[i];
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		count++;
		} 
		}
	    System.out.println(count);
	}
}


