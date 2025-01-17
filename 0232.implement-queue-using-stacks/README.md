# [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)



Complexity Analysis:

- Time Complexity: $O(1)$. push and empty are $O(1)$ and pop and peek are $O(1)$ in average. For each element, it will push and pop to the stacks twice, so the average time complexity is $O(1)$.
- Space Complexity: $O(n)$. $n$ is the size of the elements. We have $n$ elements in queue, so the space complexity is $O(n)$.
