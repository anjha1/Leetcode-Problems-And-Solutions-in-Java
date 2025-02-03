# [1207. Unique Number of Occurrences](https://leetcode.com/problems/unique-number-of-occurrences/)


Complexity Analysis:

- Time Complexity: $O(n)$. Iterate all elements and save to frequency array is $O(n)$. Suppose the limitation of number range is $2k$. Sort operation is $O(2k\log^{2k})$. Thus, the total time complexity is $O(n+k\log^k)$ which $n$ is the input length and $k=1000$.
- Space Complexity: $O(k)$. The frequency array is $O(2k)$.
