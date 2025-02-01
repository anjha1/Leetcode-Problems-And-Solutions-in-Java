# [980. Unique Paths III](https://leetcode.com/problems/unique-paths-iii/)



Complexity Analysis:

- Time Complexity: $O(m\times n\times 2^{m\times n})$. The first iteration costs $O(m\times n)$. FindPath function costs $O(m\times n\times 4^{m\times n})$ because every grid has four directions and we have $m \times n$ grids. The total time complexity is $O(m\times n\times 2^{m\times n})$.
- Space Complexity: $O(m\times n\times 2^{m\times n})$. The space complexity is as same as the function time complexity because we put the same amount of recursion functions to the stack.
