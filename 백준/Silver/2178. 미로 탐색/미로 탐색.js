const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");

const [n, m] = input.shift().split(" ").map(Number);
const map = input.map((line) => line.split(""));
const cnt = Array.from(Array(n), () => Array(m).fill(0));
const checked = Array.from(Array(n), () => Array(m).fill(0));

const dx = [0, 0, 1, -1];
const dy = [1, -1, 0, 0];

const queue = [];

function bfs(x, y) {
  queue.push([x, y]);

  while (queue.length != 0) {
    const [cx, cy] = queue.shift();

    for (let i = 0; i < 4; i++) {
      let nx = cx + dx[i];
      let ny = cy + dy[i];

      if (
        nx >= 0 &&
        ny >= 0 &&
        nx < n &&
        ny < m &&
        map[nx][ny] === "1" &&
        checked[nx][ny] === 0
      ) {
        queue.push([nx, ny]);
        checked[nx][ny] = 1;
        cnt[nx][ny] = cnt[cx][cy] + 1;
      }
    }
  }
}
checked[0][0] = 1;
bfs(0, 0);

console.log(cnt[n - 1][m - 1] + 1);
