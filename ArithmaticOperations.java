public class ArithmaticOperations
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;

    float divide;

    first=10;
    second=20;

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    divide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + divide);
  }
}