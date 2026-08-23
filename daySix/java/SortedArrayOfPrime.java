import java.util.Arrays;

public class SortedArrayOfPrime{
 public static void main(String [] args){
 
 	int [] arrays = {45,60,3,0,67,2,45,3,22,0};
 	
// 	int[] result = primeSort(arrays);
 	System.out.println(Arrays.toString(primeNumber(arrays)));
// 	System.out.println(isPrime(3));
// 	System.out.print(Arrays.toString(result));
 	}

	public static boolean isPrime(int number){
	boolean isPrimeNumber = true;
	for( int count = 2; count<=number/2; count++){
			if(number % count == 0){
			isPrimeNumber = false;
			break;
			}
		}
			return isPrimeNumber;
	}
	
	public static int[] primeNumber(int[] numbers){
	int primeNumberCount = 0;
	for(int count=0;count<numbers.length;count++){
	if(isPrime(numbers[count])){
			primeNumberCount++;
			}
		}
	int[] primeNumberArray = new int[primeNumberCount];
	int counter = 0;
	for(int count=0;count<numbers.length;count++){
	if(isPrime(numbers[count])){
			primeNumberArray[counter] = numbers[count];
			counter++;
			}
		}
		return primeSort(primeNumberArray);
	}
		public static int[] primeSort (int[] array) {
		int temporarHolder = array[0];
		
		for(int count = 0; count<array.length; count++){
			for(int counter=0; counter<array.length; counter++){
			if(array[count]> array[counter]){
				temporarHolder = array[count];
				array[count] = array[counter];
				array[counter] = temporarHolder;
			}
			}
		}
			return array;
		}
		
//			int count = 0;
//			
//		for (int num : arr){
//		if(isPrime(num)) count++;
//		}
				
//		 int [] primes = new int[count];
//		 
//		 int index = 0;
//		 
//		 for (int n : arr) {
//		 
//		 	if (isPrime(n)) {
//		 	
//		 		primes[index++] = n;
//		 		
//		 		}
//		 	}
//	
//		Arrays.sort(nums);
//		
//		for(int i = 0; i< nums.length/2; i++){
//	
//			int temp = nums[i];
//			
//			nums[i]= nums[nums.length - 1 - i];
//			
//			nums[nums.length - 1 - i] = temp;
//			
//			}
//
//			return nums;
//		
//		}
		
}

