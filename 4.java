import java.util.*;
class Four {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int list [] = {5,8,11,2,6,3,1,44,12,21};
  int temp;
  System.out.println("The list of numbers to be sorted: ");
  for(int i = 0; i < list.length; i++){
    System.out.print(list[i]+" ");
  }
  System.out.println();
  for(int i = 0; i < list.length; i++){
    for(int j = (list.length - 1); j>i; j--) {
      if (list[j-1] > list[j]){
        temp = list[j-1];
        list[j-1] = list[j];
        list[j] = temp;
      }
    }
    }
    System.out.println("The list of the number sorted by Bubble sort: ");
    for(int i = 0; i < list.length; i++){
      System.out.print(list[i]+" ");
    }
  }
}
  