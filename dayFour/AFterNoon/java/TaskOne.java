import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    int sum = 0;
    
    for(int number = 1; number <= 10; number++){
    
     System.out.print("Emter Score: ");
    
        int score = input.nextInt();
        
        sum += score;
        
   
    
    
    }
    
System.out.print("Sum is: " + sum);






}
}
