# [39. Combination Sum](https://leetcode.com/problems/combination-sum/)


Complexity Analysis:

- Time Complexity: $O(S)$. $S$ is the sum of all possible solution. The recursion decides to select the number or not, the upper bound is $O(n \times 2^n)$. The solution is much more faster than this complexity, because it has many conditions and it’s not possible to run all of possibilities. Thus, the time complexity is $O(S)$.
- Space Complexity: $O(target)$. The space complexity depends on recursion’s depth, so the worst scenario needs to recurse for target levels.
