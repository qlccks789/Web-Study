"""
함수를 다른 변수에 할당하면 그 변수로도 함수 호출이 가능하다.
"""


def movie_info(title, genre):
    return "제목 : " + title + "\n장르 : " + genre


result = movie_info("탐정: 리턴즈", "코미디, 범죄")
print(result)

# mi 변수에 movie_info 함수의 주소를 대입
mi = movie_info
result = mi("탐정: 리턴즈", "코미디, 범죄")
print(result)
