import java.util.*;
class Five {
  public static void main(String[] args) {
  String str = "ARRAY";
  char[] matrix = str.toCharArray();
  for (int i = 0; i < matrix.length; i++) {
    for (int j = matrix.length - i; j > i; j++) {
    if (j == i + 1) {
      System.out.println(matrix[j]);
    } 
    else {
      System.out.print(matrix[j]);
    }
    }
    } 
  }
}

  