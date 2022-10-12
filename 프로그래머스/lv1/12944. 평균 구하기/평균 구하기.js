function solution(arr) {
    var answer = arr.reduce((acc, cur, idx) => { return acc += cur; }, 0);
    return answer / arr.length;
}