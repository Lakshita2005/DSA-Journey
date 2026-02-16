### Day 15 – Maximum Sum of Distinct Subarrays of Size K

**Pattern:** Sliding Window + HashSet

**Optimized Approach:**
Use Sliding Window and HashSet to maintain distinct elements. Expand window and shrink when duplicate appears.

**Time Complexity:** O(n)
**Space Complexity:** O(k)

**Key Insight:**
HashSet ensures uniqueness while Sliding Window efficiently maintains window size and sum.
