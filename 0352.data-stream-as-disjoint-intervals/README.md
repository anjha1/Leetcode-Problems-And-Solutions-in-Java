# [352. Data Stream as Disjoint Intervals](https://leetcode.com/problems/data-stream-as-disjoint-intervals/)


Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of values. Save value in ordered set cost $O(\log n)$ and getIntervals costs $O(n)$. Thus, the total time complexity is $O(n)$.
- Space Complexity: $O(n)$. We save all values in ordered set. The total space complexity is $O(n)$.
