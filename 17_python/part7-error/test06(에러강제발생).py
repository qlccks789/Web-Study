# 예외를 인위적으로 발생시키기 위해서 raise 키워드를 사용한다
# raise 오류
import random

"""
i = 0
while i < 20:
    print(random.randint(1, 3))
    i += 1

print("-" * 30)
"""

try:
    # 1부터 10까지 랜덤한 수 발생
    num = random.randint(1, 10)
    print("숫자가 홀수일 경우 오류 강제 발생시킴")
    # 별도의 숫자를 지정하지 않으면 차례대로 입력됨
    print("발생 숫자 : {}".format(num))
    if num % 2:
        raise Exception("홀수 에러 발생")
except Exception as err:
    print("에러 발생 {}".format(err))