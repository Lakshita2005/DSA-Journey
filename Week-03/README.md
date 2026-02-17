### Day 15 – Maximum Sum of Distinct Subarrays of Size K

**Pattern:** Sliding Window + HashSet

**Optimized Approach:**
Use Sliding Window and HashSet to maintain distinct elements. Expand window and shrink when duplicate appears.

**Time Complexity:** O(n)
**Space Complexity:** O(k)

**Key Insight:**
HashSet ensures uniqueness while Sliding Window efficiently maintains window size and sum.

### Day 16 – Chocolate Distribution Problem

**Pattern:** Sorting + Sliding Window

**Optimized Approach:**
Sort the array first. Then use a sliding window of size m and calculate the difference between the last and first element of each window. Track the minimum difference.

**Time Complexity:** O(n log n)
**Space Complexity:** O(1)

**Key Insight:**
Sorting brings closest values together, and the minimum difference will always be found between the first and last elements of a window of size m.