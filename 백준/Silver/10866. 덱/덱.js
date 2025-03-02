const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n").slice(1);

const deque = [];
const result = [];

for (let e of input) {
  const command = e.split("_");

  switch (command[0]) {
    case "push":
      let text = command[1].split(" ");
      if (text[0] === "front") {
        deque.unshift(text[1]);
      } else {
        deque.push(text[1]);
      }
      break;

    case "size":
      result.push(deque.length);
      break;

    case "empty":
      result.push(deque.length === 0 ? 1 : 0);
      break;

    case "front":
      result.push(deque.length === 0 ? -1 : deque[0]);
      break;
    case "back":
      result.push(deque.length === 0 ? -1 : deque[deque.length - 1]);
      break;

    case "pop":
      if (deque.length === 0) {
        result.push("-1");
        break;
      }
      let text2 = command[1].split(" ");
      if (text2[0] === "front") {
        result.push(deque.shift());
      } else {
        result.push(deque.pop());
      }
      break;
  }
}

console.log(result.join("\n"));
