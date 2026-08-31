
const prompt = require("prompt-sync")();

let number = prompt("Enter a number to get its factorial: ");
let sum = 1;

for (let count = number; count >= 1; count--) {
sum *= count;
}

console.log(sum);
