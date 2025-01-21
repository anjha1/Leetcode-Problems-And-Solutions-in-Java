# [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)


Complexity Analysis:

- Time Complexity: $O(n-m)$. $n$ is the length of `s` and $m$ is the length of `p`. The first loop costs $O(n)$ and the second loop costs $O(26\times(n-m))$. The total time complexity is $O(26n-25m)=O(n-m)$.
- Space Complexity: $O(1)$. The size of `sCount` and `pCount` is 26 which is constant. Thus, the total space complexity is $O(1)$.
