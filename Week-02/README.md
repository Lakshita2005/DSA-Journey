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

### Day 10 – Valid Palindrome

**Pattern:** Two Pointers with Condition

**Optimized Approach:**  
Use two pointers from both ends, skip non-alphanumeric characters, and compare valid characters in lowercase.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**Key Insight:**  
Skipping invalid characters while moving pointers avoids extra space and keeps the solution efficient.

### Day 11 – Remove Duplicates from Sorted Array

**Pattern:** Two Pointers (Slow & Fast)

**Optimized Approach:**  
Use two pointers to modify the array in-place and keep only unique elements.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**Key Insight:**  
Since the array is sorted, duplicates are adjacent. We only need to compare current and previous elements.

### Day 12 – Valid Anagram

**Pattern:** String Frequency / Hashing

**Brute Force Approach:**  
Sort both strings and compare them.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1) or O(n)

**Optimized Approach:**  
Use a frequency array of size 26 to count characters.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**Key Insight:**  
Two strings are anagrams if every character appears the same number of times in both.
