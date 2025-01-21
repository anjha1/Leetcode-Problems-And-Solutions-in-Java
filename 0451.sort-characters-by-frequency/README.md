# [451. Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/)



Complexity Analysis:

- Time Complexity: $O(n+k\log^k)$. $n$ is the length of $s$ and $k$ is the number of different characters in the string $s$. Loop all characters in string is $O(n)$, sort characters by frequency is $O(k\log^k)$. Generate the answer string needs to iterate $k$’s different characters and concat the string is $O(n)$. The total time complexity is $O(n + k\log^k + k + n)=O(n+k\log^k)$.
- Space Complexity: $O(n + k)$. Hash map is $O(k)$ and list is $O(k)$. The string builder is $O(n)$. Thus, the total space complexity is $O(n+k)$.

