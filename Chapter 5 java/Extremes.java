import java.util.Scanner;
 public class Largest{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter number one: ");
  int numberOne = input.nextInt();

  System.out.print("Enter number two: ");
  int numberTwo = input.nextInt();

  System.out.print("Enter number three: ");
  int numberThree = input.nextInt();

  int largest = numberOne;

  if(numberTwo > largest){
      largest = numberTwo;
}
  if(numberThree > largest){
      largest = numberThree;
}
  System.out.println("Largest is " + largest);
  
  int smallest = numberOne;
  
  if(numberTwo < smallest){
  	smallest = numberTwo;
}
  if(numberThree < smallest){
  	smallest = numberThree;
  }
  System.out.println("Smallest is " + smallest);
  
  int sum = largest + smallest;
  System.out.println("Sum is " + sum);
}
}
