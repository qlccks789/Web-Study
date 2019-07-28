"""
 시퀀스 자료형의 특징
 - 연결 : "+" 연산자를 이용하여 두 시퀀스를 결합하여 새로운 시퀀스 자료형을 생성
"""
str1 = "Hello "
str2 = "Python"
list1 = ['H', 'e', 'l', 'l', 'o', ' ']
list2 = ['P', 'y', 't', 'h', 'o', 'n']
tuple1 = ('H', 'e', 'l', 'l', 'o', ' ')
tuple2 = ('P', 'y', 't', 'h', 'o', 'n')

str3 = str1 + str2
list3 = list1 + list2
tuple3 = tuple1 + tuple2

print(str3)      # Hello Python
print(list3)     # ['H', 'e', 'l', 'l', 'o', ' ', 'P', 'y', 't', 'h', 'o', 'n']
print(tuple3)    # ('H', 'e', 'l', 'l', 'o', ' ', 'P', 'y', 't', 'h', 'o', 'n')

# 다른 자료형은 오류 발생
# print(str1 + list2)
