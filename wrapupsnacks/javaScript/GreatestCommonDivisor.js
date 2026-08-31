

const prompt = require("prompt-sync")();

let firstNumber = prompt("Enter the first number: ");

let secondNumber = prompt("Enter the second number: ");



let greatestCommonDivisor= 1;
let count = 2;

let smallestNumber=firstNumber;

if(secondNumber<firstNumber) smallestNumber = secondNumber;


while(count<=smallestNumber/2){
if(firstNumber % count==0 && secondNumber % count==0){
	greatestCommonDivisor *=count;
	firstNumber/=count;
	secondNumber/=count;
}else{
count++;
	}
	
	console.log(greatestCommonDivisor);
	
}


