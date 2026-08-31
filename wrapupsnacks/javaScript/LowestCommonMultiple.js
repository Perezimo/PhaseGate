


const prompt = require("prompt-sync") ();

const firstNumber = prompt (" Enter the firstNumber: ");

const secondNumber = prompt (" Enter the firstNumber: ");


let highestNumber=firstNumber;
if(secondNumber>firstNumber) highestNumber = secondNumber;

let lowestCommonMultiple= highestNumber*2;

while(lowestCommonMultiple%firstNumber!=0 || lowestCommonMultiple % secondNumber!=0){
	lowestCommonMultiple++;

	}
	console.log(lowestCommonMultiple);
	




