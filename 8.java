import java.util.*;
class Eight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    String s = sc.next();
   	int num = 0;
   	int ints = s.length()-1;
   	s = s.toLowerCase();
   	for(int n = 0; n <= ints; n++) {
   	 if (s.charAt(n) != s.charAt(ints - n)) {
   	   num++;
   	 }
   	}
    if (num != 0) {
       System.out.print("false");
     }
     else {
       System.out.print("true");
     }
  }
}