import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest{

    @Test
    
    public void testThatAccountBalanceIsEqualZero(){
       
    double balance = 0.0;
       
    double actualBalance = AccountFunction.getAccountBalance(balance);
    
    double expectedBalance = 0.0;
    
    assertEquals(expectedBalance, actualBalance);
    
       
    }
    
    
    @Test
    
    public void testThatThatDepositedAmountForTheFirstTime(){
    
    double depositAmount = 2000.0;
    
    double balance = 0.0;
    
    double accountBalance = balance + depositAmount;
    
    double actualAmount = AccountFunction.getFirstDeposit(depositAmount);
    
    double expectedAmount = 2000.0;
    
    assertEquals(expectedAmount,actualAmount);
    

	}

    @Test
    
    public void testThatShowsAmountWithDrawalWasSuccessfull(){  
    
    double withdrawalAmount = 500.0;
    
    double balance = 1000.0;
    
    double accountBalance = balance - withdrawalAmount;
    
    double actualWithdrawal = AccountFunction.firstWithdrawal(withdrawalAmount);
    
    double expectedWithdrawal= 500.0;
    
    assertEquals(expectedWithdrawal,actualWithdrawal);
    

}




    
 /* @Test
  
  public void testThatGetTheAmountDepositedInTheAccountAndIncreaseBalance(){
  
   	  double depositAmount = 5000.0;
	  double 
   
	  double actualamount = AccountFunction.getFirstDeposit(depositedAmount);
    
	  double expectedAmount = 5000.0;
    
   assertEquals(expectedAmount,actualAmount);
//    
//
//}

//    @Test
//    
//    public void testThatFirstWithDrawalIsSuccessful(){
//    
//    double withdrawalAmount = 500.0;
//    
//    double actualWithdrawal = LogAppFunction.makeWithdrawal(withdrawAmount);
//    
//    double expectedwithdrawal= 500.0;
//    
//    assertEquals(expectedWithdrawal,actualWithdrawal);
//    
//
//}




*/




}

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out TestFile.java CodeFile.java

//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
