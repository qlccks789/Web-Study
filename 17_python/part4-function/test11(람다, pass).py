"""
람다함수
이름이 없는 1줄짜리 함수  :  lambda 인수 : <구문>
"""

func_list = [lambda x, y: x + y, lambda x, y: x - y, lambda x, y: x * y]

#  30  10  200 출력됨
for f in func_list:
    print(f(20, 10))


# 함수 선언시 아무것도 하지 않고 선언만 하고 싶은 경우
def my_pass():
    pass


print(my_pass())  # None
