class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:
        for base in range(2, n - 1):
            digits = []
            temp = n
          
            while temp > 0:
                digits.append(temp % base)
                temp //= base

            if digits != digits[::-1]:
                return False
                
        return True
