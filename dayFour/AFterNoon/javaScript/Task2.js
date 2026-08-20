

const scores = [82, 40, 78, 67, 88, 56, 95, 60, 84, 91];
let sum = 0;

for (let i = 0; i < scores.length; i++) {
  sum += scores[i];
}

const average = sum / scores.length;
console.log(average);

