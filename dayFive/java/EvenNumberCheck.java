
public class EvenNumberCheck{

public static void main(String [] args){

	Scanner input =new Scanner (System.in);

	
	System.out.print(evenNumber(8));
}

	public static boolean evenNumber(int a){
    
	    if(a % 2 == 0){
	    return true;
	    }
	    else{
	   
		return false;
		}
	}
}


