"""
클래스이름 규칙 : CamelCase 클래스이름

클래스는 class 키워드로 시작합니다.
쌍따옴표 3개가 연달아 있는 부분은 클래스의 주석입니다.
첫줄에 와야 한다.

pass : 나중에 구현하겠다.

dir은 객체가 자체적으로 가지고 있는 변수나 함수를 리스트 형태로 보여줍니다
"""
class Dog:
    """클래스의 설명입니다."""
    print("Doc")  # Doc

    def bark(self):
        pass


# ['__class__', ... 'bark']
print(dir(Dog))  # bark 함수 포함된 결과 나옴...

# 클래스에 설정한 주석문 확인
print(Dog.__doc__)   # "클래스의 설명입니다." 이 출력된다.
