class Parent:
    """부모 클래스"""
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def view_info(self):
        print("Name : {0}, Age : {1}".format(self.name, self.age))

    def character(self):
        print("인자하다")

# 상속 후 활용하기
class Child(Parent):
    """자식 클래스"""
    def __init__(self, name, age, subject, id):
        Parent.__init__(self, name, age)
        self.subject = subject
        self.id = id

    def character(self):
        print("정의롭다")

    # def view_info(self):
    #     print("Name : {0}, Age : {1}, Subject : {2}, id : {3}".format(
    #         self.name, self.age, self.subject, self.id ))


p = Parent("홍판서", 33)
c = Child("홍길동", 22, "도술", 123456)

print("Parent : {0}".format(p.__dict__));
print("Child : {0}".format(c.__dict__));

# 상속안하면 불가능 : AttributeError: 'Child' object has no attribute 'view_info'
c.view_info()