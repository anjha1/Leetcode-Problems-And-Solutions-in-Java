# [427. Construct Quad Tree](https://leetcode.com/problems/construct-quad-tree/)


Complexity Analysis:

- Time Complexity: $O(n^2\log n)$. $T(n)=4T(\frac{n}{2})+O(n^2)$. According to master theorem, the time complexity is $O(n^2\log n)$.
- Space Complexity: $O(\log n)$. Every recursion has half of `n`, so the space complexity is $O(\log n)$.
