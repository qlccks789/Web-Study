# 숫자는 0 이외는 모두 참
print("bool(1) :", bool(1))    # bool(1) : True
print("bool(0) :", bool(0))    # bool(0) : False
print("bool(-10) :", bool(-10))  # bool(-10) : True

# 비어있는 문자열을 제외한 나머지는 참
print("bool('') :", bool(""))       # False
print("bool(' ') :", bool(" "))      # True
print("bool('a') :", bool("a"))      # True

# NoneType 형의 유일한 객체 None은 객체가 존재하지 않는 다는 것을 표현할 때 사용합니다.
# 자바의 null 자바스크립트의 undefined와 비슷하게 생각하자..
# 함수가 리턴을 하지 않으면 디폴트 반환된는 값
# print(type(None))  # <class 'NoneType'>
print("bool(None) :", bool(None))     # False

# 튜플(tuple)
print("bool(()) :", bool(()))       # False
print("bool((1, 2)) :", bool((1, 2)))   # True

# 사전(dict)
print(bool({}))       # False
print(bool({"id": "aaa"}))    # True

# 셋(set)
print(bool({1, 2, 3}))  # True

# 리스트(list)
print(bool([]))         # False
print(bool([1, 2, 3]))  # True