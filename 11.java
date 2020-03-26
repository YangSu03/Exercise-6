import java.util.*;
class Eleven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number: ");
   	int num = sc.nextInt();
   	boolean[] prime = new boolean[num + 1];
   	for(int n = 0; n < num; n++) {
   	 prime[n] = true;
   	}
    for(int i = 2; i*i <= num; i++) {
   	 if (prime[i] == true){
        for (int j = i*2; j <= num; j = j+i){
          prime[j] = false;
        }
      }
   	}
     System.out.println("Prime numbers up to the given number " + num + " are: ");
     for (int x = 2; x <= num; x++){
       System.out.print(x + " ");
     }
  }
}