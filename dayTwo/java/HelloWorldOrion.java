
public class HelloWorldOrion{
public static void main(String [] args){

	int number = 100;
	int sum = 0;
	
	for (int count =1; count <= number; count++){
	
		
		if( count % 3 == 0){
		
			System.out.print("hello");
			
			}
		if (count % 5 == 0){
		
			System.out.print("world");
			
		}	
		if (count % 7 == 0){
		
			System.out.print("orion");
			
		}
		
	System.out.println(count);
		}

	}
}		 

