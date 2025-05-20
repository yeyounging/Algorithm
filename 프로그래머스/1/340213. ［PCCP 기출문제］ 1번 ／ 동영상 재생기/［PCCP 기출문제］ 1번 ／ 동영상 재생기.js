function solution(video_len, pos, op_start, op_end, commands) {
  let video_len_sec = toSec(video_len);
  let pos_sec = toSec(pos);
  const op_start_sec = toSec(op_start);
  const op_end_sec = toSec(op_end);

  // ✅ 초기 위치가 오프닝 구간이면 건너뛰기
  if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
    pos_sec = op_end_sec;
  }

  commands.forEach((command) => {
    if (command === "next") {
      pos_sec = Math.min(pos_sec + 10, video_len_sec);
    } else if (command === "prev") {
      pos_sec = Math.max(pos_sec - 10, 0);
    }

    // 명령 후 위치가 오프닝 구간이면 스킵
    if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
      pos_sec = op_end_sec;
    }
  });

  return toTime(pos_sec);
}

function toSec(timeStr) {
  const [m, s] = timeStr.split(":").map(Number);
  return m * 60 + s;
}

function toTime(sec) {
  const m = Math.floor(sec / 60);
  const s = sec % 60;
  return `${String(m).padStart(2, '0')}:${String(s).padStart(2, '0')}`;
}