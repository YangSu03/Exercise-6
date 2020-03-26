import java.util.*;
class Ten {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num=0;
  int reversenum =0;
  int sum = 0;
  System.out.println("Input your number and press enter: ");
  num = sc.nextInt();
  while( num != 0 ){
    reversenum = reversenum * 10;
    reversenum = reversenum + num%10;
    num = num/10;
  }
  if (reversenum > num) {
    sum = reversenum - num;
  }
  else {
    sum = num - reversenum;
  }
  System.out.println(sum);
  }
}