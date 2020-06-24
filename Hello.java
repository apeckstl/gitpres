public class Hello {
  public static void main(String[] args) {
    String name = new Scanner(System.in).nextLine();
    System.out.println("Hello " + name + "!");
    System.out.println("2 + 2 = " + add());
  }

  public static int add() {
    return 2 + 2;
  }
}
