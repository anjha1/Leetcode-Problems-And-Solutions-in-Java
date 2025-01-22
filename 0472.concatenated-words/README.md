# [472. Concatenated Words](https://leetcode.com/problems/concatenated-words/)



Complexity Analysis:

- Time Complexity: $O(n\log n + m)$. $n$ is the length of `words`. $m$ is the length of the longest string in the array `words`. Sort words costs $O(n\log n)$ and determine a word is concatenated word costs $O(m)$. The total time complexity is $O(n\log n + m)$
- Space Complexity: $O(m\times n)$. We have $n$ words and the worst case is all words with $m$ length. Thus, the total space complexity is $O(m\times n)$.
