const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");

const n = Number(input[0]);
const numbers = input[1].split(" ").map((i) => Number(i));

let ans = 0;

for (let i = 0; i < n; i++) {
  if (numbers[i] == 2) {
    ans++;
    continue;
  }

  if (numbers[i] % 2 == 0 || numbers[i] == 1) continue;

  let key = Math.floor(Math.sqrt(numbers[i]));
  if (key % 2 == 0) key--;

  let flag = true;
  for (let j = key; j > 2; j -= 2) {
    if (numbers[i] % j == 0) {
      flag = false;
      break;
    }
  }
  if (flag) ans++;
}

console.log(ans);
