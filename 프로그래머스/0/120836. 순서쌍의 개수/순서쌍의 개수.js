function solution(n) {
    var result = 0;
    
    for (var i = 0; i * i <= n; i++) {
      if (n % i === 0) {
        result += (n/i) == i ? 1 : 2;
      }
    }
    
    return result;
}