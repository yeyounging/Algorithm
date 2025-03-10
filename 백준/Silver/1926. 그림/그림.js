const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");
const [n, m] = input.shift().split(" ").map(Number);
const map = [];

for (let i of input) {
  const temp = i.split(" ");
  map.push(temp);
}

let max_width = 0;
let width = 0;
let cnt = 0;

for (let j = 0; j < n; j++) {
  for (let i = 0; i < m; i++) {
    if (map[j][i] == 1) {
      width = 0;
      cnt++;
      dfs(j, i);
      max_width = Math.max(max_width, width);
    }
  }
}

console.log(cnt + "\n" + max_width);

function dfs(x, y) {
  if (x < 0 || y < 0 || x > n - 1 || y > m - 1) return;

  if (map[x][y] == 1) {
    width++;
    map[x][y] = 0;
    dfs(x, y + 1);
    dfs(x, y - 1);
    dfs(x + 1, y);
    dfs(x - 1, y);
  }
}
