const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split(".");
input.pop();
input.pop();

const result = [];

for (let sentence of input) {
  const stack = [];
  const test = sentence.split("");
  let isYes = true;

  for (let char of test) {
    if (char === "(" || char === "[") {
      stack.push(char);
    }

    if (stack.length === 0 && (char === ")" || char === "]")) {
      isYes = false;
      break;
    }

    if (char === ")") {
      const front = stack[stack.length - 1];

      if (front != "(") {
        isYes = false;
        break;
      } else stack.pop();
    }

    if (char === "]") {
      const front = stack[stack.length - 1];
      if (front != "[") {
        isYes = false;
        break;
      } else stack.pop();
    }
  }

  result.push(stack.length === 0 && isYes ? "yes" : "no");
}

console.log(result.join("\n"));
