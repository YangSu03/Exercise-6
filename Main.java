import java.util.*;
class Three {
  public static void main(String[] args) {
  int arr [] = new int[25];
  for(int i = 0; i < 25; i++){
      arr[i] = i+1;
      System.out.print(arr[i] + " ");
      i = i+1;
    if (i % 5 == 0) {
      System.out.println( );
    }
    i = i-1;
  }
  }
}