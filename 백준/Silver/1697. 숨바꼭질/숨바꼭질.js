const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const [n, k] = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split(" ")
  .map(Number);

if (n > k) {
  console.log(n - k);
  return;
}

const visited = new Array(100001).fill(false);
const queue = [[n, 0]];
visited[n] = true;

while (queue.length > 0) {
  const [current, step] = queue.shift();

  if (current === k) {
    console.log(step);
    break;
  }

  for (const next of [current - 1, current + 1, current * 2]) {
    if (next >= 0 && next <= 100000 && !visited[next]) {
      visited[next] = true;
      queue.push([next, step + 1]);
    }
  }
}