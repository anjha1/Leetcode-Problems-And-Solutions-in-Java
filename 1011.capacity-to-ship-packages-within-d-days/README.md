# [1011. Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)


Complexity Analysis:

- Time Complexity: $O(n)$. $w$ is the sum of `weights` and $n$ is the length of `weights`. Binary Search costs $O(\log w)$. Also, we iterate `weights` in the binary search which costs $O(n)$. The total time complexity is $O(n\log w)$.
- Space Complexity: $O(1)$.
