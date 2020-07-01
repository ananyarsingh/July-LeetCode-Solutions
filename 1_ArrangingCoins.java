class Solution {
    public int arrangeCoins(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    
    int start = 1, end = n, mid = 1;
    
    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (sum(mid) > n) {
        end = mid;
      } else {
        start = mid;
      }
    }
    
    if (sum(end) <= n) {
      return end;
    }
    
    return start;
  }
  
  private long sum(long k) {
    return k * (k + 1) / 2;
  }
}
