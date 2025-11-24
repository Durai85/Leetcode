def prefixesDivBy5(nums):
    result = list()
    number = ''
    for i in nums:
        number += str(i)
        result.append(True if int(number,2)%5==0 else False)

    return result 