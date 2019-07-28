"""
함수의 정의

def 함수명(인자1, 인자2, ...) :
    처리구문
    return 반환할 값...

함수이름 규칙 : snake_case 함수네이밍
"""


def movie_info(title, genre):
    return "제목 : " + title + "\n장르 : " + genre


"""
제목 : 탐정: 리턴즈
장르 : 코미디, 범죄
"""
s = movie_info("탐정: 리턴즈", "코미디, 범죄")
print(s)


# 오버로딩 없음 덮어쓰기 되는 개념임... : 자바 스크립트와 비슷하다.
def movie_info2():
    print("movie_info2")


# return 없는 경우 None 이 반환됨..
s = movie_info2()  # movie_info2
print(s)  # None
