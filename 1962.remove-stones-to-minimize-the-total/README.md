# [1962. Remove Stones to Minimize the Total](https://leetcode.com/problems/remove-stones-to-minimize-the-total/)


Complexity Analysis:

- Time Complexity: $O(n + k\log n)$. $n$ is the length of piles. Create priority queue and put piles to it cost $O(n)$. Moreover, add value and remove value cost $O(\log n)$. In the final step, calculate the result costs $O(n)$. The total time complexity is $O(2n+k\log n)=O(n + k\log n)$.
- Space Complexity: $O(n)$. The space complexity of priority queue is $O(n)$.
