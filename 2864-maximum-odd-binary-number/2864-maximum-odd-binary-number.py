class Solution(object):
    def maximumOddBinaryNumber(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = list(s)
        c = s.count('1')
        ans = '1'*(c-1)+'0'*(len(s)-c)+'1'
        return ans;
        