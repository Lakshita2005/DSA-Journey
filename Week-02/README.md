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
