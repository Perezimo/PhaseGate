
import java.util.Scanner;
public class fatherage{
   public static void main(String[]age){
   Scanner input= new Scanner(System.in);

   System.out.print("father age = ");
    int fatherAge = input.nextInt();

   System.out.print ("Son age = ");
   int sonAge = input.nextInt();
   

  int twicesonAge = sonAge + sonAge;

  int twice = fatherAge - twicesonAge;

   int willbe = twicesonAge - fatherAge;
 
  
   if(willbe >0){
   System.out.println(willbe + "years the father would twice as old as his son");
    

  }else{
  System.out.println("In"+ willbe + "years the father will be twice the son age ");
  
 }

}


}
