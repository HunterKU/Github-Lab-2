import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter sales for store 1");
    int store1Sales = keyboard.nextInt();

    System.out.println("Enter sales for store 2");
    int store2Sales = keyboard.nextInt();

    System.out.println("Enter sales for store 3");
    int store3Sales = keyboard.nextInt();

    System.out.println("Enter sales for store 4");
    int store4Sales = keyboard.nextInt();

    System.out.println("Enter sales for store 5");
    int store5Sales = keyboard.nextInt();

    System.out.print("Store 1 sales: ");
    for (int i = 100; i <= store1Sales; i += 100) {
      System.out.print("-");
    }

    System.out.print("\nStore 2 sales: ");
    for (int i = 100; i <= store2Sales; i += 100) {
      System.out.print("-");
    }

    System.out.print("\nStore 3 sales: ");
    for (int i = 100; i <= store3Sales; i += 100) {
      System.out.print("-");
    }

    System.out.print("\nStore 4 sales: ");
    for (int i = 100; i <= store4Sales; i += 100) {
      System.out.print("-");
    }

    System.out.print("\nStore 5 sales: ");
    for (int i = 100; i <= store5Sales; i += 100) {
      System.out.print("-");
    }
  }
}