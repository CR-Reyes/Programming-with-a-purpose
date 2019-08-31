public class ThreeSort{
  public static void main(String[] args) {
    double n1 = Double.parseDouble(args[0]);
    double n2 = Double.parseDouble(args[1]);
    double n3 = Double.parseDouble(args[2]);
    System.out.println(Math.min(n1, Math.min(n2, n3)));
    System.out.println(Math.max(Math.min(n1, n2), Math.min(n2, n3)));
    System.out.println(Math.max(n1, Math.max(n2, n3)));
  }
}
