public class Hello {
  public static void main(String[] args) {
    String name = new Scanner(System.in).nextLine();
    System.out.println("Hello " + name + "!");
    System.out.println("2 + 2 = " + add());
    System.out.println("14 - 9 = " + subtract());
    System.out.println("2 * 10 = " + multiply());	  
  }

  public static int add() {
    return 2 + 2;
  }

  public static int subtract() {
    return 14 - 9;
  }

  public static int multiply() {
    return 2 * 10;
  }
}
