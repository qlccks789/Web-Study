class Parent:
    """부모 클래스"""
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def view_info(self):
        print("Name : {0}, Age : {1}".format(self.name, self.age))

    def character(self):
        print("인자하다")

# 상속 :  자식클래스(부모클래스)
class Child(Parent):
    """자식 클래스"""
    def __init__(self, name, age, subject, id):
        self.name = name
        self.age = age
        self.subject = subject
        self.id = id

    # 오버라이딩
    def character(self):
        print("정의롭다")


p = Parent("홍판서", 33)
c = Child("홍길동", 22, "도술", 123456)
p.character()   #  인자하다
c.character()   #  정의롭다
