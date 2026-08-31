

const prompt = require("prompt-sync")();

let number = prompt("Enter a number to check for strong number: ");
let numberString = number + "";
let keepDigit = number;
let  sum = 0;

	for( let count=1; count<=numberString.length; count++){
		let digit = keepDigit%10;
		keepDigit/=10;
		let factorial = 1;
		for(let counter=1; counter<=digit; counter++){
			factorial*=counter;
		}
		sum+=factorial;
	}
	if(sum == number){
	console.log ("It is a strong number!");
	}else{
	console.log("It is not a strong number!");	
	}
	
	
