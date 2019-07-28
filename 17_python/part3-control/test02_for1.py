# list 를 활용하는 for 구문
"""
    for <아이템 I> in <시퀀스형 객체 S> :
        <구문>

    for 변수 in 리스트:
        실행할 명령    들여쓰기로 구분함( {} ) 사용하지 않는다.
"""
print("-" * 30)
for i in [1, 2, 3]:
    print(i)

# 문자열
print("-" * 30)
for i in "Hello":
    print(i)

# 튜플
print("-" * 30)
for i in (1, 2, 3):
    print(i)

# 셋
print("-" * 30)
for i in {1, 2, 3}:
    print(i)

# range : 순서열 만들기
print("range" + "-" * 25)
for i in range(3):
    print(i)    # 0, 1, 2
print(" -" * 15)

# 시작과 종료범위 같이 지정하기
for i in range(2, 4):
    print(i)    # 2, 3

# 키값 출력
dict1 = {"a": 1, "b": 2, "c": 3};
print("-" * 30)
for key in dict1:
    print(key)   # a, b, c 출력

# 키 출력
print("-" * 30)
for key in dict1.keys():
    print(key)   # a, b, c 출력

# 값 출력
print("-" * 30)
for value in dict1.values():
    print(value)   # 1, 2, 3 출력

# 키, 값  출력
print("-" * 30)
for key in dict1:
    print(key, dict1.get(key))   # a 1,  b 2, c 3
