function solution(info, n, m) {
    const rate = info.map(item=>[...item, item[0]/item[1]]).sort((a,b)=> b[2] - a[2] || b[1] - a[1])
    const visited = Array(rate.length).fill(false)

    let a = 0;
    let b = 0;

    for(let i=0;i<rate.length;i++){
        const item = rate[i]
        if(m > b+item[1]){
            b += item[1]
            visited[i] = true
        }
    }

    for(let i=0;i<rate.length;i++){
        if(visited[i]) continue;
        const item = rate[i]
        if(n > a+item[0]){
            a += item[0]
            visited[i] = true
        }
    }

    if(visited.some(item=>!item)) return -1
    return a
}