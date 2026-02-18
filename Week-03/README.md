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

### Day 17 – First Negative Integer in Every Window of Size K

**Pattern:** Sliding Window + Queue

**Optimized Approach:**
Use Sliding Window technique and a Queue to store negative elements in the current window. As the window slides, add negative elements to the queue and remove elements that go out of the window. The front of the queue always gives the first negative integer in the current window. If the queue is empty, add 0.

**Time Complexity:** O(n)  
**Space Complexity:** O(k)

**Key Insight:**
Queue helps maintain the order of negative elements, and Sliding Window allows efficient processing of each window without rechecking all elements.
