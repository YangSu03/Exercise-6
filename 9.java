import java.util.*;
class Nine {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your Social Insurance Number(SIN)");
  int n1 = sc.nextInt();
  int a [] = new int[9];
  int dight = 100000000;
  int n2 = n1;
  int result = 0;
  for(int n = 0; n < 9; n++){
    a[n] = n2/dight;
    n2 = n2%dight;
    dight = dight/10;
  }
  for (int i = 1; i < 8;i = i+2){
    a[i] = a[i] + a[i];
  }
  int N1,N2;
  for (int x = 0; x < 8; x++){
    if (a[x] > 9){
    N1 = a[x]/10;
    N2 = a[x]%10;
    result = result + N1 + N2;
  }
    else {
      result = result = a[x];
    }
  }
  result = 50 - result;
  if (result == a[8]) {
    System.out.println("Social Insurance Number(SIN), "+ n1 +" is valid.");
  }
  else {
    System.out.println("Social Insurance Number(SIN), "+ n1 +" is not valid.");
  }
  }
}