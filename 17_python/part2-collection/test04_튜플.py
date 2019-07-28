# 리스트와 유사함. 단, 값의 변경이 불가능함   :   ( )
tuple1 = (1, 'a', [2, "b"])
print(tuple1)        # (1, 'a', [2, 'b'])
print(tuple1[0])     # 1

# tuple1[0] = 'aaa'   # 'tuple' object does not support item assignment
print(tuple1[2][0])  # 2

# 가능하다.
tuple1[2][0] = 100
print(tuple1[2][0])  # 100  왜 가능?? 튜플 자체 요소를 변경한 것이 아닌 리스트 데이터가 변경된 것임...


# 소괄호 없이도 사용이 가능하다.
# 요소가 하나인 튜플 만들기(반드시 ","와 함께 사용함 - 콤마를 안쓰면 정수가됨)
tuple2 = 3,
print(tuple2)   # (3,)

# 패킹 : 묶기 - 결과는 튜플
tuple3 = 3, 4, 5
print(tuple3, type(tuple3))   # (3, 4, 5) <class 'tuple'>

# 값의 변경이 불가능함
# TypeError: 'tuple' object does not support item assignment
# tuple3[0] = 300

# 언패킹 : 묶여 있는것을 풀기, 튜플, 리스트도 가능함
a, b, c = tuple3
print(a, b, c)  # 3 4 5

# 패킹과 언패킹을 이용한 스왑
a = 100
b = 200
a, b = b, a
print(a, b)  # 200 100
