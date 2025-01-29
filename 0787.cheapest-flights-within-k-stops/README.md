# [787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)



Complexity Analysis:

- Time Complexity: $O((m+n)\times k)$. $m$ is the length of `flights`. We first use $O(nk)$ to generate the `f` array, and use $O(mk)$ to iterate all `flights`. Thus, the total time complexity is $O(m+n)\times k)$.
- Space Complexity: $O(nk)$. The size of `f` is $O(nk)$.
