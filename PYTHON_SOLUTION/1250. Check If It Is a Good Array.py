import math

class Solution:
    def isGoodArray(self, nums: list[int]) -> bool:
        g = nums[0]
        
        for num in nums[1:]:
            g = math.gcd(g, num)
            
        return g == 1
