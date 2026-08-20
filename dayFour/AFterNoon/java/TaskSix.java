import java.util.Scanner;
public class TaskSix{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
      
    int sumOfEvenScores = 0;
    
    int counter = 0;
    
    for(int number = 1; number <= 10; number++){
    
     System.out.print("Emter Score: ");
    
     int score = input.nextInt();
     
     if(score % 2 == 0){
     
     counter += 1;
     sumOfEvenScores += score; 
     
     }
     
    
     
        
         
        
    }
    
    
    System.out.println("Average of task five is: "+ sumOfEvenScores/counter );
    







}
}
