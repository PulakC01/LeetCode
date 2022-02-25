class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        a = list(map(int,version1.split(".")))
        b = list(map(int,version2.split(".")))
        n1 = len(a)
        n2 = len(b)
        m = max(n1,n2)
        a += [0]*(m-n1)
        b += [0]*(m-n2)
        for i in range(m):
            if(a[i]>b[i]):
                return 1
            elif(a[i]<b[i]):
                return -1   
        return 0