import java.util.Scanner;
public class TaskThree{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    int average = 0;
    int sum = 0;
    
    for(int number = 1; number <= 10; number++){
    
     System.out.print("Emter Score: ");
    
        int score = input.nextInt();
        average += score;
         sum += score;
         
       
       
   
    
    
    }
    
    System.out.println("Average is: "+ average/10);
    System.out.println("Sum is: "+ sum);
    







}
}
