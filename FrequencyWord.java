//write a java program to find the frequency of each word in a string
import java.util.Scanner;
public class FrequencyWord{
  public static void main(String args[]){
    FreqOfWord fr=new FreqOfWord();
    fr.frequencyIs();
  }
}
class FreqOfWord{
  public void frequencyIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
     String a[]=s.split(" ");
    
    int count;
    boolean visited[]=new boolean[s.length()];
    for(int i=0;i<a.length;i++){
      if(visited[i]==true)
        continue;
      count=1;
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
          count++;
          visited[j]=true;
        }
      }
      System.out.println("frequency of "+a[i]+" is "+count);
    }  
  }
}