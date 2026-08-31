

	for(let counter=1; counter<=1000; counter++){
		let numberString = counter + "";
		let keepDigit = counter;
		let sum = 0;
			for(let count = 1; count<=numberString.length; count++){
			
				sum+=Math.pow(keepDigit%10, numberString.length);
			
			    keepDigit /=10;
		
		}
		if(sum == counter){
			console.log(counter);
		}
	}

