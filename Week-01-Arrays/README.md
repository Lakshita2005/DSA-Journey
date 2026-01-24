### Problem: Running Sum of 1D Array

**Pattern:** Prefix Sum

**Approach:**  
At each index, store the sum of all previous elements including the current one.

**Time Complexity:** O(n)  
**Space Complexity:** O(n) (can be optimized to O(1) in-place)

**Key Insight:**  
Running sum at index i = running sum at i-1 + nums[i]
