const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n").slice(1);

const stack = [];
const result = [];

for (let e of input) {
  const command = e.split(" ")[0];

  switch (command) {
    case "push":
      const num = e.split(" ")[1];
      stack.push(num);
      break;

    case "size":
      result.push(stack.length);
      break;

    case "empty":
      result.push(stack.length === 0 ? 1 : 0);
      break;

    case "top":
      result.push(stack.length === 0 ? -1 : stack[stack.length - 1]);
      break;

    case "pop":
      result.push(stack.length === 0 ? -1 : stack.pop());
      break;
  }
}

console.log(result.join("\n"));
