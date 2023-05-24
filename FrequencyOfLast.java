//write a java program to find the frequency of characters of last word of a string
import java.util.Scanner;
public class FrequencyOfLast{
  public static void main(String args[]){
    FreqLast f=new FreqLast();
    f.lastFreqIs();
  }
}
class FreqLast{
  public void lastFreqIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();
    String a[]=s.split(" ");
    String lastWord=a[a.length-1];
    System.out.println(lastWord);
    int count;
    boolean visited[]=new boolean[a[a.length-1].length()];
    for(int i=0;i<a[a.length-1].length();i++){
      if(visited[i]==true)
        continue;
      count=1;
      for(int j=i+1;j<a[a.length-1].length();j++){
        if(a[a.length-1].charAt(i)==a[a.length-1].charAt(j)){
          count++;
          visited[j]=true;
        }
     }
      System.out.println("the frequency of characters in "+lastWord.charAt(i)+" is "+count);
    }  
  }
}