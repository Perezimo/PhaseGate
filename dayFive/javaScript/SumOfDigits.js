
function sumOfDigits(number){

let sumDigits = 0;
	
	while(number != 0){
	
		let digit = number % 10;
		 
		 sumDigits += digit;
		 
		 number/=10;
		 }
		

	return sumDigits;
		
	}
	console.log(sumOfDigits(38));

