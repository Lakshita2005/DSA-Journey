### Day 8 – Find Pivot Index

**Pattern:** Prefix Sum

**Brute Force Approach:**  
For each index, compute left and right sums using loops and compare.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

**Optimized Approach:**  
Calculate total sum first, then iterate while maintaining left sum. Right sum is computed dynamically.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**Key Insight:**  
Pivot index exists when left sum equals right sum at that index.

### Day 9 – Reverse String

**Pattern:** Two Pointers (Left & Right)

**Approach:**
Use two pointers starting from both ends, swap characters in-place, and move inward.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

**Key Insight:**
Swapping elements from both ends reverses the array efficiently without using extra space.