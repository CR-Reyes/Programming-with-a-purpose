public class UniformRandomNumbers {
  public static void main(String[] args){
    double n1, n2, n3, n4, n5;
    n1 = Math.random();
    n2 = Math.random();
    n3 = Math.random();
    n4 = Math.random();
    n5 = Math.random();
    double average = (n1 + n2 + n3 + n4 + n5) / 5;
    double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
    double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
    System.out.println(average);
    System.out.println(min);
    System.out.println(max);
  }
}
