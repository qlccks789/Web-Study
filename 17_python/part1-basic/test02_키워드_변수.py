# import 모듈명
import keyword

print(type(keyword.kwlist))  # <class 'list'>
print(keyword.kwlist)

# 파이썬 리스트의 길이 체크
print(len(keyword.kwlist))

# 소문자는 가능함 파이썬은 대문자 키워드로 처리되어 있음
true = 200
print(true)

"""
키워드는 변수로 사용이 불가능하다.

True = 200     # 에러 발생
print(True)
"""

