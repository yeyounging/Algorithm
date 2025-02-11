const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim();

const number = Number(input);
let n = 1;
let end = 1;
for (; end < number; n++) {
  end += 6 * n;
}
console.log(n);
