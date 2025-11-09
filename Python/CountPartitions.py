# Leetcode : 3432
def countPartitions(self, nums: List[int]) -> int:
        count = 0
        for i in range(1,len(nums)):
            left = nums[:i]
            right = nums[i:]
            if (sum(left) + sum(right)) % 2 == 0 : count += 1
        return count