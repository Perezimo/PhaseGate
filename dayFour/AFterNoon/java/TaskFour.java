import java.util.Scanner;
public class TaskFour{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
      
    int sumOfEvenIndex = 0;
    
    for(int number = 2; number <= 10; number += 2){
    
     System.out.print("Emter Score: ");
    
     int score = input.nextInt();
     
     sumOfEvenIndex += score;
     
        
         
        
    }
    
    
    System.out.println("Sum of even index is: "+ sumOfEvenIndex );
    







}
}
