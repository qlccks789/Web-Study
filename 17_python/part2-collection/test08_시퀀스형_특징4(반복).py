"""
 시퀀스 자료형의 특징
 - 반복 : "*" 연산자를 이용하여 자료를 여러번 반복 할 수 있다.
"""
str1 = "------------------------------"
str2 = "-"

print(str1)
print(str2 * 30 + "*" * 30)

list1 = [3]
# list1 자체를 10번 반복처리하여 리스트를 생성
list2 = list1 * 10    # [3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
print(list2)

# tuple1 = (3)   #  3 <class 'int'>
tuple1 = (3,)
print(tuple1, type(tuple1))  # (3,) <class 'tuple'>
tuple2 = tuple1 * 10
print(tuple2)  # (3, 3, 3, 3, 3, 3, 3, 3, 3, 3)


list1 = ['a', 'b']
list3 = list1[0] * 10 + 'b' * 10
print(list3)   # aaaaaaaaaabbbbbbbbbb
