import java.util.Scanner;
public class TaskFive{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
      
    int sumOfEvenScores = 0;
    
    for(int number = 1; number <= 10; number++){
    
     System.out.print("Emter Score: ");
    
     int score = input.nextInt();
     
     if(score % 2 == 0){
     
     sumOfEvenScores += score; 
     
     }
     
  
         
        
    }
    
    
    System.out.println("Sum of even index is: "+ sumOfEvenScores );
    




}
}
