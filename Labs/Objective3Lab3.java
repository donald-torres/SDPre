public class Objective3Lab3 {
  public static void main(String[] args) {
  double first, second, third, result;

  first = 1 + (int)(Math.random() * 6);
  second = 1 + (int)(Math.random() * 6);
  third  = 1 + (int)(Math.random() * 6);
  
  result = first + second + third;

  System.out.println(first + " + " + second + " + " + third + " = " + result); 

  }
}