class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        result = [[]]
        
        for num in nums:
            result += [curr + [num] for curr in result]
            
        return result
