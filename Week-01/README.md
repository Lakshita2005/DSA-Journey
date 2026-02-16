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

### Day 4 – Contains Duplicate

**Pattern:** Hashing / Frequency Tracking

**Approach:**
Traverse the array and store each element in a HashSet.
If an element is already present in the set, return true immediately.
If the loop finishes, return false.


**Time Complexity:** O(n)
**Space Complexity:** O(n)

**Key Insight:**
Hashing allows us to check duplicates in constant time instead of using nested loops.

### Day 5 – Two Sum

**Pattern:** Hashing / Two Pointer Thinking

**Approach (HashMap):**  
Store each element and its index in a HashMap. For each element, calculate the complement and check if it already exists.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

**Key Insight:**  
Instead of searching for pairs, store previously seen values and look up the required complement.

### Day 6 – Maximum Subarray

**Pattern:** Kadane’s Algorithm / Dynamic Programming

**Optimized Approach (Kadane’s Algorithm):**  
Track the maximum sum ending at each index and update the global maximum.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**Key Insight:**  
At each index, decide whether to start a new subarray or continue the existing one.

### Day 7 – Product of Array Except Self

**Pattern:** Prefix & Suffix Products

**Optimized Approach:**  
First store prefix products, then multiply with suffix products in a second pass.

**Time Complexity:** O(n)  
**Space Complexity:** O(1) extra (output array excluded)

**Key Insight:**  
The product of all elements except self = product of elements before × product of elements after.
