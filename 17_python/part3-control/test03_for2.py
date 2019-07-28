"""
for ~ else 반복문을 break 없이 빠져 나왔는지 체크...
"""
print("-" * 30)
for i in [1, 2, 3]:
    print(i)
    # if (i == 2):  # This inspection highlights redundant parentheses in statements  불필요한 괄호 사용할 때
    if i == 2:
        break
else:
    print("break 없이 반복문을 빠져 나왔음")
