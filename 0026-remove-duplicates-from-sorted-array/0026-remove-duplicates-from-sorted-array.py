class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        i = 0
        ans = []
        while i < n:
            if nums[i] not in ans:
                ans.append(nums[i])
            i += 1
        for i in range(len(ans)):
            nums[i] = ans[i]
        return len(ans)