//write a java program to find the difference between number of characters of first word and last word in a string.
import java.util.Scanner;
public class DifferenceOf{
public static void main(String args[]){
  Difference d=new Difference();
  d.differenceIs();
 }
}
class Difference{
  public void differenceIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    String s1[]=s.split(" ");
    
    int num1=s1[0].length();
    int num2=s1[s1.length-1].length();
    int  difference=num1-num2;
    System.out.println("the difference is "+difference);
  }
}