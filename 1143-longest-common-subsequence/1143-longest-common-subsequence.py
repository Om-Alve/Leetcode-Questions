class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        memo = [[-1 for i in range(len(text2))] for j in range(len(text1))]
        def lcs(i: int, j: int, memo: list) -> int:
            if i >= len(text1) or j >= len(text2):
                return 0
            if memo[i][j] != -1:
                return memo[i][j]
            elif text1[i] == text2[j]:
                memo[i][j] = 1 + lcs(i+1,j+1,memo)
            else:
                memo[i][j] = max(lcs(i+1,j, memo), lcs(i,j+1, memo))
            return memo[i][j]

        return lcs(0,0,memo)