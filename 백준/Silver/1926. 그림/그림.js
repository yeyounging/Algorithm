const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");

const [n, m] = input.shift().split(" ").map(Number);
const map = input.map(line => line.split(" ").map(Number));

let max_width = 0;
let cnt = 0;

function dfs(x, y) {
  if (x < 0 || y < 0 || x >= n || y >= m || map[x][y] === 0) return 0;

  map[x][y] = 0;
  let width = 1;

  const dx = [1, 0, -1, 0];
  const dy = [0, 1, 0, -1];

  for (let i = 0; i < 4; i++) {
    width += dfs(x + dx[i], y + dy[i]);
  }

  return width;
}

for (let j = 0; j < n; j++) {
  for (let i = 0; i < m; i++) {
    if (map[j][i] === 1) {
      cnt++;
      max_width = Math.max(max_width, dfs(j, i));
    }
  }
}

console.log(cnt);
console.log(max_width);