# [797. All Paths From Source to Target](https://leetcode.com/problems/all-paths-from-source-to-target/)



Complexity Analysis:

- Time Complexity: $O(n\times 2^n)$. $n$ is the number of nodes. The worst case scenario is every nodes can connect to all the larger nodes. The number of path is $O(2^n)$ and the path is $O(n)$. Thus, the total time complexity is $O(n\times 2^n)$.
- Space Complexity: $O(n)$. The stack costs $O(n)$.
