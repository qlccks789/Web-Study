# 순서가 있는 임의의 데이터 집합 : [ 요소, ... ]
# 위치를 이용한 값의 변경 및 추출
list1 = [1, 'a', [2, "b"]]
print(list1)     # [1, 'a', [2, 'b']]
print(list1[0])     # 1
list1[0] = 'aaa'
print(list1)     # ['aaa', 'a', [2, 'b']]
print(list1[0])     # aaa
print(list1[2][0])  # 2
