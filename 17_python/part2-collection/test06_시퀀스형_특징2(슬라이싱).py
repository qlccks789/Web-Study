"""
 시퀀스 자료형의 특징
 - 슬라이싱 : 특정 구간(시작, 끝 - 1)의 값을 가져올 수 있다.
"""
my_str = "Hello Python"
my_list = ['H', 'e', 'l', 'l', 'o', ' ', 'P', 'y', 't', 'h', 'o', 'n']
my_tuple = ('H', 'e', 'l', 'l', 'o', ' ', 'P', 'y', 't', 'h', 'o', 'n')

print(my_str[0:3])      # Hel
print(my_list[0:3])     # ['H', 'e', 'l']
print(my_tuple[0:3])    # ('H', 'e', 'l')

print(my_str[3:])       # lo Python
print(my_str[-3:])      # hon

print(my_str[: 3])      # Hel
print(my_str[:-3])      # Hello Pyt

# 데이터의 깊은 복사시 사용
print(my_list[:])        # ['H', 'e', 'l', 'l', 'o', ' ', 'P', 'y', 't', 'h', 'o', 'n']

my_list_cp = my_list[:]
my_list_cp[0] = "T"

# ['T', 'e', 'l', 'l', 'o', ' ', 'P', 'y', 't', 'h', 'o', 'n']
# ['H', 'e', 'l', 'l', 'o', ' ', 'P', 'y', 't', 'h', 'o', 'n']
print(my_list_cp, my_list)
