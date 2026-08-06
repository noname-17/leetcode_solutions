class Solution:
    def maxArea(self, height: List[int]) -> int:
        n=len(height)
        max_water=0
        l=0 
        r=n-1
        while l<r:
            curr=min(height[l],height[r])*(r-l)
            max_water=max(max_water,curr)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return max_water