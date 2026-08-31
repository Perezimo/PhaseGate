
public class RangeOfArmStrongNumber{

public static void main(String [] args){
	for(int counter=1; counter<=1000; counter++){
		String numberString = counter + "";
		int keepDigit = counter;
		int sum = 0;
		for(int count = 1; count<=numberString.length(); count++){
			sum+=Math.pow(keepDigit%10, numberString.length());
			keepDigit /=10;
		}
		if(sum == counter){
			System.out.println(counter);
		}
	}
}
}

