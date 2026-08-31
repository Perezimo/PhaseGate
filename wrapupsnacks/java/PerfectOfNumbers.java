public class PerfectOfNumbers{
public static void main(String [] args){

for(int count =1; count<=1000; count++){
	for(int counter= 0; counter<=count; counter++){
		if(counter*counter == count){
			System.out.println(count);
		}
	}
	}
}
}


