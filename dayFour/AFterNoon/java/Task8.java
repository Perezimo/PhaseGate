import java.util.Scanner;
public class Task8{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
      
    int sum = 0;
    
    
    for(int number = 1; number <= 10; number++){
    
     System.out.print("Emter 10 valid Score between 1 and 100: ");
    
     int score = input.nextInt();
     
     sum += score;
     
     }
     
    
   
    System.out.println("Sum of scores is: " + sum );
    

}
}
