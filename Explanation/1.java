dea (dynamic programming)
Let total = sum(arr). If we can find a subset with sum s, the other subset sum is total - s and difference is |total - 2*s|.
We only need to consider achievable subset sums s up to total // 2 (best split is near half).
Build a boolean DP table dp[i][s] = whether some subset of first i elements has sum s.
After filling DP, find the largest s <= total//2 with dp[n][s] == True. That s gives the minimal difference total - 2*s.
Backtrack to recover which elements form that subset.
Time complexity: O(n * total).
Space: O(n * total) (can be reduced to O(total) if you only need the difference, but keep O(n*total) to reconstruct subsets easily).
