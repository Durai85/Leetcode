def smallestNumber(self, n: int) -> int:
    l = len(bin(n)[2:])
    num = "1"*l
    return int(num,2)

