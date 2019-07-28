"""
파이썬에서 사용하는 자료형

수치형, 문자형, 논리형
리스트(list)  -  자바 리스트 ??
셋(set)  - 자바의 셋 ??
튜플(tuple)  - 읽기 전용 리스트??
사전(dict)  - 자바의 맵??
"""
val = 10
print(val, type(val))  # <class 'int'>

val = 10.3
print(val, type(val))  # <class 'float'>

val = "10"
val = '10'
print(val, type(val))  # <class 'str'>

val = True
val = False
print(val, type(val))  # <class 'bool'>

# list
val = [1, 2, 3]
print(val, type(val))  # <class 'list'>

# set
val = {1, 2, 3}
print(val, type(val))  # <class 'set'>

# tuple
val = (1, 2, 3)
print(val, type(val))  # <class 'tuple'>

# dict 타입
val = {"id": 'hong', "name": "홍길동", "addr": "서울"}
print(val, type(val))  # <class 'dict'>
