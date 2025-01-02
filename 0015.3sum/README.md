# [15. 3Sum](https://leetcode.com/problems/3sum/)

Complexity Analysis:

- Time Complexity: $O(n^2)$. Sort’s time complexity is $O(n\log^n)$ and the iteration with two pointers is $O(n^2)$, so the total time complexity is $O(n^2)$.
- Space Complexity: $O(n)$. $n$ is the length of nums. We use an extra ArrayList with complexity $O(3(n-2))$ to save the answer.
