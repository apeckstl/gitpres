public class Hello {
  public static void main(String[] args) {
    String name = new Scanner(System.in).nextLine();
    System.out.println("Hello " + name + "!");
    System.out.println("2 + 2 = " + add());
    System.out.println("14 - 9 = " + subtract(14, 9));
    System.out.println("2 * 10 = " + multiply());	  
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static int multiply() {
    return 2 * 10;
  }
}
