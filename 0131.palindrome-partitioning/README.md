# [131. Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)


Complexity Analysis:

- Time Complexity: $O(n\times2^n)$. $n$ is the length of s. In the worst case, s has completely same characters in $n$ length , and the time complexity is $O(n\times2^n)$.
- Space Complexity: $O(n^2)$. We use $O(n^2)$ for array f and use $O(n)$ in backtracking. The total space complexity is $O(n^2)$.
