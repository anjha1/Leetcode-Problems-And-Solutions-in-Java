# [912. Sort an Array](https://leetcode.com/problems/sort-an-array/)



Complexity Analysis:

- Time Complexity: $O(n\log n)$. The recurrence relation of merge sort is $T(n)=2T(\frac{n}{2})+O(n)$. According to master theorem, the total time complexity is $O(n\log n)$.
- Space Complexity: $O(n)$. We use an extra array `tmp`, so the total space complexity is $O(n)$.
