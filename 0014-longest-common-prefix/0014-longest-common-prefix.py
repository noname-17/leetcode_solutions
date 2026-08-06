class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        n=len(strs)
        ans=""
        for i in range(len(strs[0])):
            ch=strs[0][i]
            for j in range(1,n):
                if i>=len(strs[j]) or strs[j][i]!=ch:
                    return ans
            ans+=ch
        return ans

