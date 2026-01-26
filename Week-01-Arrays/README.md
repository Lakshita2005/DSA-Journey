### Day 1 - Running Sum of 1D Array

**Pattern:** Prefix Sum

**Approach:**  
At each index, store the sum of all previous elements including the current one.

**Time Complexity:** O(n)  
**Space Complexity:** O(n) (can be optimized to O(1) in-place)

**Key Insight:**  
Running sum at index i = running sum at i-1 + nums[i]

### Day 2 – Build Array from Permutation

**Pattern:** Index Mapping

**Approach:**  
Each element in the array represents an index. For every index `i`, we set:
ans[i] = nums[nums[i]]


**Time Complexity:** O(n)  
**Space Complexity:** O(n) (can be optimized to O(1) using in-place encoding)

**Key Insight:**  
Values can act as indices when the array is a permutation.

### Day 3 – Best Time to Buy and Sell Stock

**Pattern:** Minimum Tracking / Greedy Optimization

**Approach:**
Track the minimum stock price seen so far. At each day, calculate the profit if sold today and update the maximum profit accordingly.


**Time Complexity:** O(n)
**Space Complexity:** O(1)

**Key Insight:**
Instead of checking all pairs, track the minimum buying price and compute profit on the fly to ensure buy happens before sell.