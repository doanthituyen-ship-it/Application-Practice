
package bt;




   import java.util.Scanner;

public class ReverseAnArray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of values: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      int i2 = i + 1;
      System.out.print(" Value number " +i2+ ": ");
      a[i] = scanner.nextInt();
    }
    System.out.print("[");
    for (int i = 0; i < n; i++) {
      if (i != n - 1) {
        System.out.print(a[i] + ", ");
      } else {
        System.out.print(a[i]);
      }
    }
    System.out.println("]");
    for (int i = 0; i <= (a.length) / 2; i++) {
      int tam = a[i];
      a[i] = a[n - 2];
      a[n - 2] = tam;
      n--;
    }
    System.out.print("[");
    for (int i = 0; i < a.length; i++) {
      if (i != a.length-1) {
        System.out.print(a[i] + ", ");
      } else {
        System.out.print(a[i]);
      }
    }
    System.out.println("]");
  }
}

   


