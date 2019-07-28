"""
set 타입은 중복된 데이터를 허용하지 않는다.
교집합, 합집합, 차집합 등을 수학적인 계산이 가능
"""
# 중복되는 값을 입력되지 않는다.
data = {4, 1, 2, 3, 2, 3}

# 4가 출력된다.
print(len(data))  # 4
print(data)      # {1, 2, 3, 4}

# 값을 추가하기
data.add(9)
data.add(8)
print(data)      # {1, 2, 3, 4, 8, 9}

s1 = {10, 20, 30, 40, 50}
s2 = {30, 40, 50, 60, 70}
print(s1)        # {40, 10, 50, 20, 30}
print(s2)        # {70, 40, 50, 60, 30}
print(type(s1))  # <class 'set'>
print(type(s2))  # <class 'set'>

# print(s1 + s2)  # 에러발생함(TypeError: unsupported operand type(s) for +: 'set' and 'set')

# 합집합 : union, |
s = s1.union(s2)
print(s)     # {70, 40, 10, 50, 20, 60, 30}
s = s1 | s2
print(s)     # {70, 40, 10, 50, 20, 60, 30}

# 교집합 : intersection, &
s = s1.intersection(s2)
print(s)     # {40, 50, 30}
s = s1 & s2
print(s)     # {40, 50, 30}

# 차집합 : difference, -
s = s1.difference(s2)
print(s)     # {10, 20}
s = s1 - s2
print(s)     # {10, 20}
