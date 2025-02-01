# [953. Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/)


Complexity Analysis:

- Time Complexity: $O(m\times n)$. $m$ is the length of the words array and $n$ is the maximum length of string in the words array. Because we compared all words two by two, so the total time complexity is $O(m\times n)$.
- Space Complexity: $O(C)$. $C$ is the length of order. We use an extra array to save it, so the total space complexity is $O(C)$.
