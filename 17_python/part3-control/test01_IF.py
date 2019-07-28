# 참고사항
# and, or 는 단축평가(자바의 &&, ||)
#
# 조건 : if
# if 조건식:
#     실행문장
#
# if 조건식:
#     실행문장
# else:
#     실행문장
#
# if 조건식:
#     실행문장
# elif 조건식:
#     실행문장
# else :
#     실행문장
#
# 파이썬은 switch 구문이 없음...
# 들여쓰기로 블럭을 구분한다.
value = True
if value:
    print("value is True")  # value is True

# 10는 참으로 해석된다.
value = 10
if value:
    print(str(value) + "는 참으로 해석된다.")
    # print(value + "는 참으로 해석된다.")  #TypeError: unsupported operand type(s) for +: 'int' and 'str'

# value is 10
# if (value == 10):  # 에러는 아니지만 불필요한 괄호로 인식한다.
if value == 10:
    print("value is 10")

# value isn't 10
value = 100
if value == 10:
    print("value is 10")
else:
    print("value isn't 10")

# 화면에서 값 입력받기 - 입력받은 값은 문자열로 인식
num = input("점수 ? ")  # 점수 ? _
print(type(num))   # <class 'str'>

score = int(num)
print(type(score))  # <class 'int'>

result = "";
if 90 <= score <= 100:
    result = "A"
elif 80 <= score < 90:
    result = "B"
elif 70 <= score < 80:
    result = "C"
elif 60 <= score < 70:
    result = "D"
else:
    result = "F"

print("당신의 성적은 : " + result)  # 당신의 성적은 : ?
