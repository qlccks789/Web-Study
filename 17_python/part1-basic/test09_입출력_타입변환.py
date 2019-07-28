# 숫자와 문자열의 결과 합치기
num1 = "100"
num2 = 100

# 에러 발생
# print(num1 + num2)  # TypeError: must be str, not int

"""
int(값) - 정수로 변경
str(값) - 문자열로 변경
float(값) - 실수로 변경
"""
print(int(num1) + num2)   # 200
print(num1 + str(num2))   # 100100

print(int(3.4))  # 3
print(float(3))  # 3.0
print(float("3"))  # 3.0
print(float("3.5"))  # 3.5

# msg = "안녕하세요\n     저는\n파이썬입니다."

msg = """
안녕하세요
    저는
파이썬입니다.
"""
print(msg)

data = "a"
print(data * 50)

print("-" * 50)

# 다음줄로 넘기지 않고 이어서 붙이기, end 속성에 입력한 값이 추가된다.
print("hello~ ", end="")
print("python")
