# [1061. Lexicographically Smallest Equivalent String](https://leetcode.com/problems/lexicographically-smallest-equivalent-string/)


Complexity Analysis:

- Time Complexity: $O(n+m+|\Sigma|^2)$. $n$ is the length of str1 and str2 and $m$ is the length of baseStr. Also, $|\Sigma|$ is the number of unique characters. The total time complexity is $O(n+m+|\Sigma|^2)$.
- Space Complexity: $O(|\Sigma|^2)$. The DFS recursion costs $O(|\Sigma|^2)$ in maximum.
