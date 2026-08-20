import java.util.Scanner;

public class AccountFunction{

    public static double getAccountBalance(double balance){
    
    balance = 0.0;
    return balance;
    }
    
  public static double getFirstDeposit(double depositAmount){
  
     
    double balance = 0.0;     
    double checkBalance = balance + depositAmount ;
      
    return checkBalance;
    }
    
    
    public static double firstWithdrawal(double withdrawAmount){
    
    double balance = 1000.0;
     
    double checkBalance = balance - withdrawAmount;
      
    return checkBalance;
    }
    
    
   
   
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    String welcome = """
    
    Welcome to Transaction Log App
    
    1. Deposit 
    2. Withdraw
    3. Show Transactions
    4. Exit
    
       
    """;
    
    System.out.println(welcome);
    
    int choice = input.nextInt();
    
    
    
    
}
    
   
   









}
