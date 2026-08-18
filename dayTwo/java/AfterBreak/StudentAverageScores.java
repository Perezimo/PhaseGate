
public class StudentAverageScores{

	public static char studentAverage(int score1, int score2 , int score3){
	
			int totalScores = score1 + score2 + score3;
			
			int average = totalScores/ 3;
			
			if (90<=average<=100){
			
				return "A";
				}
				
			else if(80<=average<90){
			
				return "B";
				}
			else if(70<=average<80){
			
				return "C";
				}
			else if(60<=average<70){
			
				return "D";
				}
			else if (0<=average<60){
			
				return "F";
				}			
	}
				
		
	public static void main(String [] args){
	
	System.out.print(studentAverage(40, 80, 60));
	}
}
