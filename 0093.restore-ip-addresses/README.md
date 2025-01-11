# [93. Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/)

Complexity Analysis:

- Time Complexity: $O(1)$. $n$ is the length of `s`. The depth of recursion is $3^{segCount}$ and restore an IP address is $O(n)$. `segCount` is 4 which is constant and the largest $n$ for this question is $3\times4=12$ that is constant as well, so the total time complexity is $O(1)$.
- Space Complexity: $O(1)$. The size segments array is 4 which is cosntant.
