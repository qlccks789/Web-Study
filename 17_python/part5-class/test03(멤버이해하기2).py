"""
파이썬은 기본적으로 클래스도 메모리에 변수를 가질 수 있는 공간이 있고, 클래스를
통해 만든  인스턴스 객체도 별도의 변수 공간을 가지게 됩니다.

그러므로 변수나 함수의 이름을  찾는 경우
인스턴스 객체    클래스 객체    전역 순서대로 찾아나갑니다.
"""





class Insa:
    data = "Hello"   # 클래스의 멤버변수(자바의 static 처럼 생각하면 편하다.)

    #  객체 자신을 가리키는 참조 변수로 관습적으로 self 를  사용하고 있습니다.
    #  이름의 변경이 가능하나 일반적인 네이밍이 self 이다. 자바의 this와 비슷하게 생각
    def print_info(self):   # 클래스의 메서드
        # 지역변수
        data = "a"
        print("print_info data : {0}".format(data))  # print_info data : a
        print("print_info self.data : {0}".format(self.data))   # print_info self.data : Hello

print("Insa.data : {0}".format(Insa.data))   # Insa.data : Hello

my1 = Insa()       # Insa 클래스 인스턴스 객체 생성
print("my1.data : {0}".format(my1.data))    # my1.data : Hello

my1.print_info()

print("my1.data : {0}".format(my1.data))    # my1.data : Hello

my1.data = "aaa"
print("my1.data : {0}".format(my1.data))    # my1.data : aaa

my2 = Insa()
print("my2.data : {0}".format(my2.data))    # my2.data : Hello

Insa.data = "hi"
print("Insa.data : {0}".format(Insa.data))   # Insa.data : hi

my3 = Insa()
print("my3.data : {0}".format(my3.data))   # my3.data : hi

