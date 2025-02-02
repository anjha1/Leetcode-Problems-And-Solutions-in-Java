# [997. Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/)


Complexity Analysis:

- Time Complexity: $O(n+m)$. $m$ is the length of `trust` array. We first iterate the `trust` array and iterate $n$ times to find the judge. The total time complexity is $O(n+m)$.
- Space Complexity: $O(n)$. We use two arrays to record trust other people and is trusted array. The total space complexity is $O(2n)=O(n)$.
