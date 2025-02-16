# [1834. Single-Threaded CPU](https://leetcode.com/problems/single-threaded-cpu/)


Complexity Analysis:

- Time Complexity: $O(n\log n)$. Array Sort costs $O(n\log n)$, add priority queue costs $O(\log n)$ and we running $n$ times which is the length of tasks. The total time complexity is $O(2n\log n)=O(n\log n)$.
- Space Complexity: $O(n)$. newTasks costs $O(n)$ and priority queue costs $O(n)$ as well. The total space complexity is $O(2n)=O(n)$.
