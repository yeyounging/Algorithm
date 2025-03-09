const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");
const [n, m] = input.shift().split(" ").map(Number);
const map = [];

for (let i of input) {
  const temp = i.split(" ");
  map.push(temp);
}

let visited = Array.from(Array(n), () => Array(m).fill(0));

let max_width = 0;
let width = 0;
let cnt = 0;

for (let j = 0; j < n; j++) {
  for (let i = 0; i < m; i++) {
    if (visited[j][i] == 0 && map[j][i] == 1) {
      width = 0;
      cnt++;
      bfs(j, i);
      if (max_width < width) max_width = width;
    }
  }
}

console.log(cnt + "\n" + max_width);

function bfs(x, y) {
  if (x < 0 || y < 0 || x > n - 1 || y > m - 1) return;

  if (visited[x][y] == 1) return;

  visited[x][y] = 1;
  if (map[x][y] == 1) {
    width++;
    bfs(x, y + 1);
    bfs(x, y - 1);
    bfs(x + 1, y);
    bfs(x - 1, y);
  }
}
