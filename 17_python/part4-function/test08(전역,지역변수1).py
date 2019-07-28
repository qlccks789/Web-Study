"""
LGB 규칙
Local Scope  Global Scope  Built-in Scope 순서로 찾음
"""
# 전역변수
num1, num2 = 10, 20
def func(a, b):
    # 지역변수
    num1, num2 = 100, 200
    num1 += a
    num2 += b
    print(num1, num2)    # 110 220

func(num1, num2)
print("num1: {0}, num2: {1}".format(num1, num2))  # num1: 10, num2: 20
