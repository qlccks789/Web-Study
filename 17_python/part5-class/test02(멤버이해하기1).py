"""
    파이썬은 자바 + 자바스크립트 개념이 섞여있다??
"""
class Insa:
    pass

my1 = Insa()
my2 = Insa()

my1.msg = "Hello Python!!"    # my1의 인스턴스 공간에 msg 변수 추가됨..
# print(Insa.msg)   # Error 발생
print(my1.msg)  # Hello Python!! 출력됨...
# print(my2.msg)  # Error 발생 'Insa' object has no attribute 'msg'
