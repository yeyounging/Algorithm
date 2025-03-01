const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");

input.shift();

const queue = {};
let front = 0;
let end = 0;

for (let el of input) {
  if (el.includes("push")) {
    const num = el.split(" ")[1];
    queue[end++] = num;
    continue;
  }
  if (el === "size") {
    console.log(end - front);
    continue;
  }
  if (el === "empty") {
    console.log(front === end ? 1 : 0);
    continue;
  }
  if (front === end) { // 큐가 비어 있을 때 처리
    console.log(-1);
    continue;
  }
  if (el === "front") {
    console.log(queue[front]);
    continue;
  }
  if (el === "back") {
    console.log(queue[end - 1]);
    continue;
  }
  if (el === "pop") {
    console.log(queue[front]);
    front++;
  }
}