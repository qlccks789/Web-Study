# 인자이름을 이용해 값을 전달하는 방법 : 키워드 인자 이용
def method(name, age=0):
    print("이름 : {0}, 나이 : {1}".format(name, age))


method("홍길동", 100)  # 이름 : 홍길동, 나이 : 100
method(100)  # 이름 : 100, 나이 : 0
method(age=100, name="홍길동")  # 이름 : 홍길동, 나이 : 100
