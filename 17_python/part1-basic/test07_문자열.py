# 문자열 결합
msg = "Hello " "Python"
print(msg)  # HelloPython

msg = "Hello " + "Python"
print(msg)  # HelloPython

#  문자열.count(찾을문자)  :  찾은 문자의 개수 반환
msg = "Hello python"
print("count : ", msg.count("o"))   # 2

"""
못찾았을 경우 -1을 반환
문자열.find(찾을문자, 시작위치, 끝위치(포함안됨))   : 찾아서 위치 반환
문자열.rfind(찾을문자, 시작위치, 끝위치(포함안됨))  : 오른쪽부터 찾아서 위치 반환
"""
msg = "Hello python"
print("find(o) : ", msg.find("o"))     # find :  4 못찾으면 -1
print("rfind(o) : ", msg.rfind("o"))   # rfind :  10
print("find(o, 5) : ", msg.find("o", 5))   # 10
print("rfind(o, 5) : ", msg.rfind("o", 5))   # 10
print("find(o, 5, 10) : ", msg.find("o", 5, 10))   # -1
print("rfind(o, 0, 5) : ", msg.rfind("o", 0, 5))   # 4

"""
index : find와 비슷하나 못찾으면 에러가 발생한다.
"""
print("index(o) : ", msg.index("o"))      # 4
print("rindex(o) : ", msg.rindex("o"))     # 10
print("index(o, 5) : ", msg.index("o", 5))   # 10
# print(msg.index("a", 5))  # 못찾으면 에러 :  ValueError: substring not found
