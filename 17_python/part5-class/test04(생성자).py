class Member:

    # 생성자
    def __init__(self, name="장보고", age=0, email="jang@a.com"):
        print("생성자 호출")
        self.name = name
        self.age = age
        self.email = email

    def print_info(self):
        print("name", self.name)
        print("age", self.age)
        print("email", self.email)


def process():
    m = Member()
    m.print_info()

    m = Member("홍길동", 22, "hong@hong.com")
    m.print_info()


process()

# TypeError: print_info() missing 1 required positional argument: 'self'
# 에러발생함
# Member.print_info()