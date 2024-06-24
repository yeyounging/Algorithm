let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let N = parseInt(input[0], 10);
let numbers = input[1].split(' ').map(Number);
let v = parseInt(input[2], 10);

let count = 0;
for (let i = 0; i < N; i++) {
  if (numbers[i] === v) {
    count++;
  }
}

console.log(count);
